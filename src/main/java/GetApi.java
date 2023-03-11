import org.springframework.web.client.RestTemplate;

public class GetApi {
    public static void main(String [] args){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/get/list";
        var response = restTemplate.getForObject(url, String.class);
        System.out.println(response);
    }
}
