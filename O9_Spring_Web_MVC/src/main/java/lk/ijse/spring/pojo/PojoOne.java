package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 10/3/2023 -- 1:23 PM
 **/

@Component
public class PojoOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public PojoOne() {
        System.out.println("PojoOne - Instantiate");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoOne - Bean name awareness");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoOne - Bean factory awareness");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoOne - Application context awareness");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoOne - Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoOne - Death");
    }
}
