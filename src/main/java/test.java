import com.genRocket.engine.EngineAPI;
import com.genRocket.engine.EngineManual;
import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import org.json.JSONException;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class test {
    public static void main (String args[]) throws JSONException {
        String scenario = "TestDataScenario.grs";
        String domainName = "TestData";
        EngineAPI engine= new EngineManual();
        engine.scenarioLoad(scenario);
        //    engine.scenarioRunInMemory(domainName);
        List<Object> test=  engine.scenarioRunInMemory(domainName);

        String jsonStr = JSONArray.toJSONString(test);
        System.out.println(jsonStr);
//        JSONArray jsonArray = (JSONArray) jsonStr.get("contact");
//
//        for(int i=0;i<jsonStr.length();i++)
//        {
//            JSONObject jsonObject1 =  jsonStr.getJSONObject(i);
//            String value1 = jsonObject1.optString("key1");
//            String value2 = jsonObject1.optString("key2");
//            String value3 = jsonObject1.optString("key3");
//            String value4 = jsonObject1.optString("key4");
//        }

//        for (int i=0; i<test.size(); i++){
//            System.out.println(test.get(i));
//        }
       // JSONArray jsonArray = (JSONArray) test.get("URL");

    }
}
