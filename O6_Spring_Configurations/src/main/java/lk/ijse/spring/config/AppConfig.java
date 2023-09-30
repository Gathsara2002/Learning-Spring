package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Gathsara
 * created : 9/30/2023 -- 7:51 PM
 **/

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }
}
