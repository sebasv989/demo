package com.example.demo.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){

        return args -> {
            Customer sebastian = new Customer(
                    "Sebastian",
                    LocalDate.of(2022, Month.MAY,6),
                    "sebastianvillada989@gmail.com"
            );
            Customer joe = new Customer(
                    "Joe",
                    LocalDate.of(2022, Month.MAY,6),
                    "Joe@gmail.com"
            );

            repository.saveAll(
                    List.of(sebastian, joe)
            );

        };
    }
}
