package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gathsara
 * created : 10/6/2023 -- 4:49 PM
 **/

@RestController
@RequestMapping("/three")
public class ControllerThree {

     /* @GetMapping(path = "/id/{C001}/{Gathsara}")
    public String testOne(@PathVariable("C001") String id, @PathVariable("Gathsara") String name) {
        System.out.println(id);
        System.out.println(name);
        return "GetMapping 1 invoked";
    }*/

   /* @GetMapping(path = "/id/{id}/{name}")
    public String testOne(@PathVariable String id,@PathVariable String name) {
        System.out.println(id);
        System.out.println(name);
        return "GetMapping 1 invoked";
    }*/

    @GetMapping(path = "/ids/{id:[C]{1}[0-9]{3}}/{name}")
    public String testOne(@PathVariable String id, @PathVariable String name) {
        System.out.println(id);
        System.out.println(name);
        return "GetMapping 1 invoked";
    }
}


