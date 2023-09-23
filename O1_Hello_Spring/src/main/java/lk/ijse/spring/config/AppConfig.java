package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Gathsara
 * created : 9/23/2023 -- 12:31 PM
 **/

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig Constructor");
    }
}
