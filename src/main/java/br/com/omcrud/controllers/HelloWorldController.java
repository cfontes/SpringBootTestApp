package br.com.omcrud.controllers;

import br.com.omcrud.persistence.entities.User;
import br.com.omcrud.persistence.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    UserRepository userRepo;

    @RequestMapping("/")
    String home() {
        User author = User.createUser("test", "test", "test");
        author.setFirstName("Test");

        userRepo.create(author);

        return "Hello World!";
    }
}
