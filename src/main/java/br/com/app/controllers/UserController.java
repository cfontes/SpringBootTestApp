package br.com.app.controllers;

import java.security.Principal;

import br.com.app.persistence.entities.User;
import br.com.app.persistence.entities.UserRole;
import br.com.app.persistence.repositories.UserRepository;
import br.com.app.security.PasswordCrypto;
import br.com.app.security.RoleEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepo;

    @Autowired
    PasswordCrypto passwordCrypto;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody User user) {

        user.setPassword(passwordCrypto.encrypt(user.getPassword()));

        //create a new user with basic user privileges
        user.getRoles().add(new UserRole(RoleEnum.USER.toString(), user));

        if (userRepo.save(user) != null) {
           return new ResponseEntity<>(HttpStatus.OK);
        } else {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public Principal getUser(Principal user){
        return user;
    }

}
