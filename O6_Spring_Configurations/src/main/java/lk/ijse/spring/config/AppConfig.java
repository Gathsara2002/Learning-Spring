package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author : Gathsara
 * created : 9/30/2023 -- 7:51 PM
 **/

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
//@Import({ConfigOne.class, ConfigTwo.class})
//@ImportResource("classpath: abc.xml")
//@ImportResource("filepath:abc.xml")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }
}
