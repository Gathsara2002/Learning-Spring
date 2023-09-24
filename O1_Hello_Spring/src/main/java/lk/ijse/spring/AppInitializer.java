package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
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
        System.out.println("-------- Context Invocation -------");

        PojoTwo bean = ctx.getBean(PojoTwo.class);
        bean.testMethod();

        //check singleton
        System.out.println("-------- check singleton -------");

        PojoOne bean1 = ctx.getBean(PojoOne.class);
        PojoOne bean2 = ctx.getBean(PojoOne.class);
        System.out.println(bean1);
        System.out.println(bean2);

        //get predefine class bean
        System.out.println("-------- get predefine class bean -------");

        BasicDataSource bean3 = ctx.getBean(BasicDataSource.class);
        System.out.println(bean3);


        //Bean Id
        System.out.println("-------- Bean Id -------");

        Object bean4 = ctx.getBean("pojoOne");
        System.out.println(bean4);

        Object bean5 = ctx.getBean("getDataSource");
        System.out.println(bean5);


        //Hooking process
       /* Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                ctx.close();
            }
        }));*/

        ctx.registerShutdownHook();
    }
}
