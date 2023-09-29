package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoOne;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 10:19 AM
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        PojoOne bean1 = ctx.getBean(PojoOne.class);
        PojoOne bean2 = ctx.getBean(PojoOne.class);
        System.out.println(bean1);
        System.out.println(bean2);

        PojoTwo bean3 = ctx.getBean(PojoTwo.class);
        PojoTwo bean4 = ctx.getBean(PojoTwo.class);
        System.out.println(bean3);
        System.out.println(bean4);
    }
}
