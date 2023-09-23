package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoOne;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Gathsara
 * created : 9/23/2023 -- 12:29 PM
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        //Context Invocation
        PojoTwo bean = ctx.getBean(PojoTwo.class);
        bean.testMethod();

        //check singleton
        PojoOne bean1 = ctx.getBean(PojoOne.class);
        PojoOne bean2 = ctx.getBean(PojoOne.class);
        System.out.println(bean1);
        System.out.println(bean2);

        ctx.close();
    }
}
