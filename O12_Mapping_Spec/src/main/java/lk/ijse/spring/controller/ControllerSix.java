package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author : Gathsara
 * created : 10/7/2023 -- 12:52 PM
 **/

@RestController
@RequestMapping("/six")
public class ControllerSix {

    /*@GetMapping(consumes = "application/json")
    public String testOne() {
        return "GetMapping 1 invoked";
    }*/

    /*@GetMapping
    public String testTwo() {
        return "GetMapping 2 invoked";
    }*/

   /* @GetMapping(produces = {MediaType.TEXT_HTML_VALUE})
    public String testThree() {
        return "GetMapping 3 invoked";
    }*/

    @GetMapping(headers = {"Content-Type=application/json", "Accept=text/html"})
    public String testFour() {
        return "GetMapping 4 invoked";
    }

}
