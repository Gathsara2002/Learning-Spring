package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gathsara
 * created : 10/12/2023 -- 11:45 AM
 **/

@RestController
//@RequestMapping("/customers")
@CrossOrigin
public class ControllerSeven {

    @PostMapping
    public void saveCustomer(CustomerDTO dto) {
        System.out.println("Testing" + " - " + dto.toString());
    }
}
