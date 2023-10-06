package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : Gathsara
 * created : 10/5/2023 -- 4:24 PM
 **/

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public ModelAndView test() {
        return new ModelAndView("/Customer");
    }
}
