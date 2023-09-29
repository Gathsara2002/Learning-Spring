package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 9/29/2023 -- 11:38 AM
 **/

@Component
public class Boy implements DI {

    /*property injection*/
   /* @Autowired
    @Qualifier("girlOne")
    GoodGirl girl;

    public Boy() {
        System.out.println("Boy Instantiated");
    }

    public void chatWithGirl() {
        //Girl girl = new Girl();
        girl.chat();
    }*/
    /*------------------------------------------------------------------*/

    /*constructor injection*/
    /*GoodGirl girlOne;

    @Autowired
    public Boy(GoodGirl girl) {
        System.out.println("Boy Instantiated");
        this.girlOne = girl;
    }

    public void chatWithGirl() {
        girlOne.chat();
    }
*/
    /*------------------------------------------------------------------*/

    /*setter method injection*/
    /*GoodGirl girl;

    public Boy() {
        System.out.println("Boy Instantiated");
    }

    @Autowired
    public void setInjection(GoodGirl girl) {
        this.girl=girl;
    }

    public void chatWithGirl() {
        girl.chat();
    }*/
    /*------------------------------------------------------------------*/

    /*interface through injection*/

    GoodGirl girl;

    public Boy() {
        System.out.println("Boy Instantiated");
    }

    public void chatWithGirl() {
        girl.chat();
    }

    @Autowired
    @Override
    public void setDI(GoodGirl girl) {
        this.girl = girl;
    }
}
