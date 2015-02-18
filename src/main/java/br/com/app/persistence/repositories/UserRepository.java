package br.com.app.persistence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.app.persistence.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

    public User findByUsername(String username);

}