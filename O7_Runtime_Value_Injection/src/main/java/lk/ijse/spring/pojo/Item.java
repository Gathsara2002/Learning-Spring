package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 10/1/2023 -- 8:45 PM
 **/

@Component
public class Item implements InitializingBean {

    @Value("I00-001")
    private String id;

    public Item() {
        System.out.println("Item Instantiated");

        //constructor eka call veddi properties vala values vatanne
       // System.out.println(id);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(id);
    }
}
