package br.com.omcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("br.com.omcrud")
@EnableAutoConfiguration
@EnableJpaRepositories("br.com.omcrud.persistence.repositories")
@EntityScan("br.com.omcrud.persistence.entities")
public class AppStart {

    /**
     * Starts spring boot application
     * @param args args from user
     */
    public static void main(String[] args) {
         SpringApplication.run(AppStart.class, args);
    }

}
