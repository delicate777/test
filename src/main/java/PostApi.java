
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PostApi {
    public static void main(String [] args){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        String url = "http://localhost:8080/get/add";

        Map<String, String> dic=new HashMap<>();

        dic.put("name","zhangsan");
        dic.put("age",String.valueOf(18));
        dic.put("date", "s");
        //String json= JSON.toJSONString(dic);
        HttpHeaders headers = new HttpHeaders();
        //headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Map<String,String>> requestEntity = new HttpEntity<>(dic, headers);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
        var response=restTemplate.postForObject(url,requestEntity,String.class);
        System.out.println(responseEntity);
        System.out.println(response);
    }
}
