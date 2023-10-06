package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gathsara
 * created : 10/6/2023 -- 1:03 PM
 **/

@RestController
@RequestMapping("/two")
public class ControllerTwo {

    @GetMapping
    public String testOne() {
        return "GetMapping 1 invoked";
    }

    @GetMapping(path = "/a")
    public String testTwo() {
        return "GetMapping 2 invoked";
    }
}
