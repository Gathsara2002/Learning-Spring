package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gathsara
 * created : 10/7/2023 -- 12:13 PM
 **/

@RestController
@RequestMapping("/five")
public class ControllerFive {

    @GetMapping(params = {"id", "name"})
    public String testOne() {
        return "GetMapping 1 invoked";
    }

    @GetMapping(params = {"address", "salary"})
    public String testTwo() {
        return "GetMapping 2 invoked";
    }

}
