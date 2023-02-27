package rest;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class RestGet {
    public static String Get(String url){
        CloseableHttpClient httpClient= HttpClientBuilder.create().build();
        String entity;
        HttpResponse response;
        try {
            response = httpClient.execute(new HttpGet(url));
            entity= EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return entity;
    }
}
