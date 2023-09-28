package lk.ijse.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Gathsara
 * created : 9/24/2023 -- 1:24 PM
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public AppConfig() {
        System.out.println("AppConfig - Instantiate");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("AppConfig - Bean name awareness");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("AppConfig - Bean factory awareness");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("AppConfig - Application context awareness");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AppConfig - Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("AppConfig - Death");
    }
}
