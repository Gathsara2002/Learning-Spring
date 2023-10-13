package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.util.ResponseUtil;
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

    @GetMapping
    public ResponseUtil getAllCustomer() {
        ArrayList<CustomerDTO> list = new ArrayList<>();
        list.add(new CustomerDTO("C001", "Gathsara", "Ambalangoda", 1000000000));
        list.add(new CustomerDTO("C002", "Chavindu", "Ambalangoda", 50000));
        list.add(new CustomerDTO("C003", "Hirusha", "Galle", 200000));
        return new ResponseUtil("OK", "Successfully Loaded", list);
    }

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO dto) {
        System.out.println(dto.toString());
        return new ResponseUtil("OK", "Successfully Added", dto);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        return new ResponseUtil("OK", "Successfully Deleted", id);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto) {
        return new ResponseUtil("OK", "Successfully Updated", dto);
    }
}
