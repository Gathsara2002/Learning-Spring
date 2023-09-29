package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 8:26 PM
 **/

@Component
public class PojoOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoOne() {
        System.out.println("PojoOne Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoOne bean factory awareness");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoOne bean name awareness");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoOne destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoOne is ready");
        System.out.println("--------------------------------------------- ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoOne application context awareness");
    }

    /*This is light mode*/

    @Bean
    public PojoTwo pojoTwo(){

        //inter bean dependency invocation
        PojoThree pojoThree1 = pojoThree();
        PojoThree pojoThree2 = pojoThree();
        System.out.println(pojoThree1);
        System.out.println(pojoThree2);
        return new PojoTwo();
    }

    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
