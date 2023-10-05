package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Gathsara
 * created : 10/5/2023 -- 4:24 PM
 **/

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public String test() {
        return "Hello";
    }
}
