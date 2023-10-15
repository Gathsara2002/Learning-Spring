package lk.ijse.spring.config;

import com.sun.media.sound.ModelMappedInstrument;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Gathsara
 * created : 10/6/2023 -- 12:39 PM
 **/

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"lk.ijse.spring.controller", "lk.ijse.spring.advisor"})
public class WebAppConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
