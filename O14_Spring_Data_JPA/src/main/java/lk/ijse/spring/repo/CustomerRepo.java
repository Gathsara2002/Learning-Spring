package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Gathsara
 * created : 10/15/2023 -- 1:06 PM
 **/
public interface CustomerRepo extends JpaRepository<Customer, String> {
}
