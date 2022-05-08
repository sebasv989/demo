package com.example.demo.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){

        return args -> {
            new Customer(
                    1L,
                    "Sebastian",
                    LocalDate.of(2022, Month.MAY,6),
                    "sebastianvillada989@gmail.com"
            );
        };
    }
}
