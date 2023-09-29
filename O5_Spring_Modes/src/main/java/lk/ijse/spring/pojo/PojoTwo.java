package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 8:26 PM
 **/

public class PojoTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoTwo() {
        System.out.println("PojoTwo Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoTwo bean factory awareness");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoTwo bean name awareness");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoTwo destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoTwo is ready");
        System.out.println("----------------------------------------");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoTwo application context awareness");
    }
}
