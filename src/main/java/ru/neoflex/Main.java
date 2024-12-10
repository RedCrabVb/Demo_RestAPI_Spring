package ru.neoflex;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Demo API", version = "1.0"))
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        SpringApplication.run(Main.class, args);
    }


}
