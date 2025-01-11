package krypto.krypto_procject;

import java.util.Collections;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KryptoProcjectApplication {

  @RequestMapping("/test")
  public Map<String, String> home() {
    return Collections.singletonMap("message", "test");
  }

	public static void main(String[] args) {
		SpringApplication.run(KryptoProcjectApplication.class, args);
	}

}
