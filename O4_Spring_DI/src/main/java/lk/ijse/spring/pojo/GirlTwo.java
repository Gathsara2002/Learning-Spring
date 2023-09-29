package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 12:34 PM
 **/

@Component
//@Primary
public class GirlTwo implements GoodGirl {
    public GirlTwo() {
        System.out.println("GirlTwo Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("Girl Two chatting");
    }
}
