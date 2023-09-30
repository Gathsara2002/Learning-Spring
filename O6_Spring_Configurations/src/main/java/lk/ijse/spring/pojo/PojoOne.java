package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 7.52 PM
 **/

@Component
public class PojoOne {
    public PojoOne() {
        System.out.println("PojoOne Instantiated");
    }

}
