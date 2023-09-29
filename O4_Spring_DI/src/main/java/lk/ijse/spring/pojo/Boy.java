package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 11:38 AM
 **/

@Component
public class Boy {

    @Autowired
    GoodGirl girl;

    public Boy() {
        System.out.println("Boy Instantiated");
    }

    public void chatWithGirl(){
        //Girl girl = new Girl();
        girl.chat();
    }

}
