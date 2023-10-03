package lk.ijse.spring.pojo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gathsara
 * created : 10/3/2023 -- 3:07 PM
 **/

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public void callMe(){
        System.out.println("Call me method invoked");
    }
}
