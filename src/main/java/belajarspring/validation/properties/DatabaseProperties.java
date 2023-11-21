package belajarspring.validation.properties;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("database")
public class DatabaseProperties {
    @NotBlank
    private String name;

    @NotBlank
    private String password;
}
