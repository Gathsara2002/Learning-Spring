package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 9/23/2023 -- 12:36 PM
 **/
@Component
public class PojoTwo {
    public PojoTwo() {
        System.out.println("PojoTwe  Constructor");
    }

    public void testMethod() {
        System.out.println("This for testing");
    }

}
