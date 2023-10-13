package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Gathsara
 * created : 10/12/2023 -- 9:19 PM
 **/

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class ControllerEight {

    @PutMapping
    public void saveCustomer(@RequestBody CustomerDTO dto) {
        System.out.println(dto.toString());
    }
}
