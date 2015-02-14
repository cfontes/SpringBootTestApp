package br.com.kanbanapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cfontes
 * @Date 14/02/2015.
 */
@RestController
@EnableAutoConfiguration
public class AppStart {

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
