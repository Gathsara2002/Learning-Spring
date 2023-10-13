package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : Gathsara
 * created : 10/13/2023 -- 5:43 PM
 **/

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @PostMapping
    public void saveCustomer(CustomerDTO dto) {
        System.out.println("Testing" + " - " + dto.toString());

    }

    @PutMapping
    public ArrayList<CustomerDTO> updateCustomer(@RequestBody CustomerDTO dto) {
        ArrayList<CustomerDTO> list = new ArrayList<>();
        list.add(dto);
        list.add(dto);
        list.add(dto);
        return list;
    }
}
