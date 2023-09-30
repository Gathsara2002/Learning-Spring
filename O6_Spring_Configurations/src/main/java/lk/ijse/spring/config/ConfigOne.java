package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Gathsara
 * created : 9/30/2023 -- 7:51 PM
 **/

@Configuration
public class ConfigOne {
    public ConfigOne() {
        System.out.println("ConfigOne Instantiated");
    }

    @Bean
    public PojoTwo pojoTwo() {
        return new PojoTwo();
    }
}
