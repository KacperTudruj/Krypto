package krypto.krypto_procject;

import java.util.Collections;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication
@RestController
public class HealthCheckController {
    
 @RequestMapping("/healthcheck")
  public Map<String,String> healthcheck() {
    return Collections.singletonMap("message", "healthcheck");
  }
}
