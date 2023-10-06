package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author : Gathsara
 * created : 10/6/2023 -- 12:41 PM
 **/

@RestController
@RequestMapping("/one")
public class ControllerOne {

    @GetMapping
    public String testOne() {
        return "GetMapping invoked";
    }

    @PostMapping
    public String testTwo() {
        return "PostMapping invoked";
    }

    @PutMapping
    public String testThree() {
        return "PutMapping invoked";
    }

    @DeleteMapping
    public String testFour() {
        return "DeleteMapping invoked";
    }
}
