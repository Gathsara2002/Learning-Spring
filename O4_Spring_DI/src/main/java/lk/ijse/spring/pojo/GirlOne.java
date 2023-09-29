package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 11:51 AM
 **/

@Component
@Primary
public class GirlOne implements GoodGirl {
    public GirlOne() {
        System.out.println("GirlOne Instantiated");
    }

    @Override
    public void chat(){
        System.out.println("Girl One chatting");
    }
}
