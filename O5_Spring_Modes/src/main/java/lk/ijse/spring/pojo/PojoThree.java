package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 8:26 PM
 **/

public class PojoThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoThree() {
        System.out.println("PojoThree Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoThree bean factory awareness");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoThree bean name awareness");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoThree destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoThree is ready");
        System.out.println("--------------------------------------------");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoThree application context awareness");
    }
}
