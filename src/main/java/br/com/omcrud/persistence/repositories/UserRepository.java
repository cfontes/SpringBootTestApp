package br.com.omcrud.persistence.repositories;

import br.com.omcrud.persistence.entities.User;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends AbstractJpaDAO<User> {

}