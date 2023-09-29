package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 9/24/2023 -- 1:54 PM
 **/
@Component
public class PojoTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoTwo() {
        System.out.println("PojoTwo - Instantiate");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("--------------------------------------------------------");
        System.out.println("PojoTwo - Bean name awareness");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoTwo - Bean factory awareness");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoTwo - Application context awareness");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoTwo - Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoTwo - Death");
    }
}
