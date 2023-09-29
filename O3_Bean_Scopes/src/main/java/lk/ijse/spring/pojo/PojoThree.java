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

public class PojoThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoThree() {
        System.out.println("PojoThree - Instantiate");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("--------------------------------------------------------");
        System.out.println("PojoThree - Bean name awareness");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoThree - Bean factory awareness");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoThree - Application context awareness");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoThree - Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoThree - Death");
    }
}
