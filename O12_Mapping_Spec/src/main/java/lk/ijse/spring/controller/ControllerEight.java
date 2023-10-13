package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : Gathsara
 * created : 10/12/2023 -- 9:19 PM
 **/

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class ControllerEight {

    @PutMapping
    public ArrayList<CustomerDTO> saveCustomer(@RequestBody CustomerDTO dto) {
        ArrayList<CustomerDTO> list = new ArrayList<>();
        list.add(dto);
        list.add(dto);
        list.add(dto);
        return list;
    }
}
