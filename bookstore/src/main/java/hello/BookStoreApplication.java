package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BookStoreApplication {
    @RequestMapping("/recommended")
    public String readingList() {
        return "Spring in Action (Meaning), Could Native Java (O' Reilly), Learning Spring Boot (Pact)";
    }

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);
    }
}