package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Gathsara
 * created : 10/6/2023 -- 12:39 PM
 **/

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"lk.ijse.spring.controller"})
public class WebAppConfig {
}
