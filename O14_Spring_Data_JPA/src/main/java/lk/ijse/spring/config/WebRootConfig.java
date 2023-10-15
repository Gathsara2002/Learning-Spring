package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Gathsara
 * created : 10/6/2023 -- 12:40 PM
 **/

@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}
