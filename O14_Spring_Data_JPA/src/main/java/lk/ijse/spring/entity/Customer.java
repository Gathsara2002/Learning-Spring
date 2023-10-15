package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Gathsara
 * created : 10/15/2023 -- 11:21 AM
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private double salary;
}
