package lk.ijse.spring.config;

import lk.ijse.spring.pojo.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Base64;

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

    //bean method
    @Bean
    public BasicDataSource getDataSource(){
        return new BasicDataSource();
    }
}
