package com.example.demo.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path ="api/v1/customer")
public class CustomerController {

    @GetMapping
    public List<Customer> getCustomers(){
        return List.of(
                new Customer(
                        1L,
                        "Sebastian",
                        LocalDate.of(2022, Month.MAY,6),
                        "sebastianvillada989@gmail.com"
                )
        );
    }
}
