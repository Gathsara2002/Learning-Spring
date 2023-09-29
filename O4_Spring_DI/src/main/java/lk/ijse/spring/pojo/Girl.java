package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 11:51 AM
 **/

@Component
public class Girl implements GoodGirl {
    public Girl() {
        System.out.println("Girl Instantiated");
    }

    @Override
    public void chat(){
        System.out.println("hello");
    }
}
