package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 10:23 AM
 **/

@CacheConfig
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {

    @Bean
    public PojoThree pojoThree() {
        return new PojoThree();
    }
}
