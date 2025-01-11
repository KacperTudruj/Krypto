package krypto.krypto_procject.domain.healthCheck;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import krypto.krypto_procject.domain.healthCheck.dto.HealthCheckStatusDto;
import krypto.krypto_procject.domain.healthCheck.service.CheckDatabaseConnection;
import krypto.krypto_procject.domain.healthCheck.service.RandomQuote;


@Component
public class HealthCheck {

    @Autowired
  private RandomQuote randomQuote;

    @Autowired
  private CheckDatabaseConnection checkDatabaseConnection;

    public HealthCheckStatusDto check() {
        HealthCheckStatusDto healthCheckStatusDto = new HealthCheckStatusDto();

        boolean databaseConnected = checkDatabaseConnection.check();

        healthCheckStatusDto.setStatus((databaseConnected) ? "UP" : "DEGRADED");
        healthCheckStatusDto.setMessage(randomQuote.getQute());
        healthCheckStatusDto.setDatabase(databaseConnected);

        return healthCheckStatusDto;
    }
}
