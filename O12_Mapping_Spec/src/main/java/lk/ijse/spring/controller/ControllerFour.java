package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gathsara
 * created : 10/6/2023 -- 5:36 PM
 **/

@RestController
@RequestMapping("/four")
public class ControllerFour {

    @GetMapping(path = "/ab?d")
    public String testOne() {
        return "GetMapping 1 invoked";
    }
}
