import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRestful {
    @GetMapping("/get")
    public ResponseEntity<String> getEndpoint() {
        String response = "Hello, world!";
        return ResponseEntity.ok(response);
    }
}
