package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Gathsara
 * created : 10/13/2023 -- 5:43 PM
 **/

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping
    public ResponseUtil getAllCustomer() {

        List<Customer> all = customerRepo.findAll();
        return new ResponseUtil("OK", "Successfully Loaded", all);
    }

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO dto) {
        boolean exists = customerRepo.existsById(dto.getId());
        if (exists) {
            throw new RuntimeException(dto.getId() + " Customer Already exists");
        }
        Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary());
        customerRepo.save(customer);
        return new ResponseUtil("OK", "Successfully Added", dto);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        customerRepo.deleteById(id);
        return new ResponseUtil("OK", "Successfully Deleted", id);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto) {
        boolean exists = customerRepo.existsById(dto.getId());
        if (!exists) {
            throw new RuntimeException(dto.getId() + " Customer not exists");
        }
        Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary());
        customerRepo.save(customer);
        return new ResponseUtil("OK", "Successfully Updated", dto);
    }
}
