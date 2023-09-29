package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 8:23 PM
 **/

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }

    @Bean
    public PojoTwo pojoTwo(){
        return new PojoTwo();
    }

    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
