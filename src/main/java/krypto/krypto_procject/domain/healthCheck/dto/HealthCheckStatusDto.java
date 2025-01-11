package krypto.krypto_procject.domain.healthCheck.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Generuje gettery, settery, toString, equals i hashCode
@NoArgsConstructor // Generuje konstruktor bezargumentowy
@AllArgsConstructor // Generuje konstruktor ze wszystkimi polami
public class HealthCheckStatusDto {
    private String status;
    private String message;
    private boolean database;
}
