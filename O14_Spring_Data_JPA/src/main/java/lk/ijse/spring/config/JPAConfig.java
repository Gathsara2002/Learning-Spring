package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author : Gathsara
 * created : 10/15/2023 -- 11:44 AM
 **/

@Configuration
@EnableJpaRepositories(basePackages = {"lk.ijse.spring.entity"})
@EnableTransactionManagement
public class JPAConfig {
}
