package krypto.krypto_procject.http.controller.healthCheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import krypto.krypto_procject.domain.healthCheck.HealthCheck;
import krypto.krypto_procject.domain.healthCheck.dto.HealthCheckStatusDto;

@RestController
public class HealthCheckController {
    
  @Autowired
  private HealthCheck healthCheckApp;

  @GetMapping("/healthcheck")
  public HealthCheckStatusDto healthcheck() {
    return healthCheckApp.check();
  }
}
