import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Exchange;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import rest.CurrencyEnam;
import rest.RestGet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class parametrizedTest {
    static CurrencyEnam currencTOStr;
    static ResourceBundle bundle;
    static Exchange[] exchangesMass;
    static Exchange[] exchangesMass2;
    @Parameterized.Parameters
    public static Collection options(){
        return Arrays.asList(CurrencyEnam.values());
    }

    public parametrizedTest(CurrencyEnam currency){
        System.out.println("start");
        currencTOStr = currency;
        bundle = ResourceBundle.getBundle(currencTOStr.getCurr());
    }

    @Test
    public void test3() throws JsonProcessingException {
        String response2 = RestGet.Get("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode="+bundle.getString("currEnam")+"&json");
        ObjectMapper om = new ObjectMapper();
        exchangesMass2= om.readValue(response2, Exchange[].class);
        for (Exchange mass : exchangesMass2) {
            System.out.println(mass.txt+" ("+mass.cc+"): "+mass.rate);
            Assert.assertEquals(Integer.parseInt(bundle.getString("r030")), mass.r030);
        }
    }
}
