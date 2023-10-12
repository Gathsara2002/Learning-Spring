package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gathsara
 * created : 10/12/2023 -- 11:45 AM
 **/

@RestController
@RequestMapping("/customer")
public class ControllerSeven {

    @PostMapping
    public void saveCustomer(String id, String name, String address, String salary) {
        System.out.println("Testing" + id + name + address + salary);
    }
}
