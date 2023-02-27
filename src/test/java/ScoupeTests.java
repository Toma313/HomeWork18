import models.Exchange;
import org.junit.BeforeClass;
import org.junit.runners.Parameterized;
import rest.CurrencyEnam;
import rest.RestGet;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;
//package parametrizedTest;



//public class ScoupeTests {


  //  static Exchange[] exchangesMass;
//    @Parameterized.Parameters
//    public static Collection options(){
//        return Arrays.asList(CurrencyEnam.values());
//    }
//    public ResourceBundle bundle;
//    //public ParamCurr(CurrencyEnam users) {
//     //  bundle = ResourceBundle.getBundle(CurrencyEnam.getCurr());
//    }
//
//
//
//    @Test
//    public static void b(CurrencyEnam currency ) throws JsonProcessingException {
//
//        //String response = RestGet.Get("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode="+bundle.getCurr("currenc")+"json");
//        ObjectMapper om = new ObjectMapper();
//       // exchangesMass= om.readValue(response, Exchange[].class);
//    }
//    @Test
//    public void test(){
//        for (Exchange mass : exchangesMass) {
//         //   System.out.println(mass.txt+" "+mass.cc+": "+mass.rate);
//            System.out.println(mass.txt+"("+mass.cc+"),");
//        }
//    }
//}
