package br.com.omcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AppStart {

    /**
     * Starts spring boot application
     * @param args args from user
     */
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
