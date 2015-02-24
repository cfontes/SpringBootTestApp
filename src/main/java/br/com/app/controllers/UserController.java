package br.com.app.controllers;

import java.security.Principal;

import br.com.app.persistence.entities.User;
import br.com.app.persistence.entities.UserRole;
import br.com.app.security.PasswordCrypto;
import br.com.app.security.RoleEnum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestParam String email, @RequestParam String password) {

        User user = new User();

        user.setUsername(email);
        user.setEmail(email);
        user.setPassword(PasswordCrypto.getInstance().encrypt(password));

        //create a new user with basic user privileges
        user.getRoles().add(new UserRole(RoleEnum.USER.toString(), user));
    }

    @RequestMapping(method = RequestMethod.GET)
    public Principal getUser(Principal user){
        return user;
    }

}
