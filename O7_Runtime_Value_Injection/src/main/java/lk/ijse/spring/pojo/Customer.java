package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Gathsara
 * created : 10/1/2023 -- 8:03 PM
 **/

@Component
public class Customer {


    public Customer(@Value("IJSE") String name) {
        System.out.println("Customer Instantiated " + name);
    }

    @Autowired
    public Customer(@Value("10") int id) {
        System.out.println("Customer Instantiated " + id);
    }
}
