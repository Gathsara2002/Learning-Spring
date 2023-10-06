package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author : Gathsara
 * created : 10/4/2023 -- 7:48 PM
 **/

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"lk.ijse.spring.controller"})
public class WebAppConfig {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
