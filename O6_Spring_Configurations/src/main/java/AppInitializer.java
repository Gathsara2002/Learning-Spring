import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.config.ConfigOne;
import lk.ijse.spring.config.ConfigTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Gathsara
 * created : 9/30/2023 -- 7:51 PM
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        //register configuration classes directly
        ctx.register(AppConfig.class);
//        ctx.register(ConfigOne.class);
//        ctx.register(ConfigTwo.class);

        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
