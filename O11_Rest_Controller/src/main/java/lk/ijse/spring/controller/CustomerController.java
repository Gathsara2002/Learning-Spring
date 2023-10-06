package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gathsara
 * created : 10/6/2023 -- 11:56 AM
 **/

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public String getCustomer(){
        return "Hello Spring";
    }

    /*public int getCustomer(){
        return 1;
    }*/

   /* public boolean getCustomer(){
        return true;
    }*/

    @GetMapping
    public String test(){
        return "Hello Spring";
    }

}
