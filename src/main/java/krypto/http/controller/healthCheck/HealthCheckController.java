package krypto.http.controller.healthCheck;

import java.util.Collections;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HealthCheckController {
    
  @RequestMapping("/healthcheckk")
  public Map<String,String> healthcheck() {
    return Collections.singletonMap("message", "healthcheck");
  }
}
