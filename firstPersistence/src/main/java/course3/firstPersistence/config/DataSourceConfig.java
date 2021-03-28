package course3.firstPersistence.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    @ConfigurationProperties(prefix = "uda.datasource")
    public DataSource getDatasource() {
        DataSourceBuilder dsb = DataSourceBuilder.create();
        dsb.username("first");
        dsb.password(securePasswordService());
//        dsb.url("jdbc:mysql://localhost:3306/plant2");
        return dsb.build();
    }

    private String securePasswordService() {
        return "111";
    }
}
