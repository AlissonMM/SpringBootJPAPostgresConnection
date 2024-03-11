package alisson.SpringDataJPA.repository;

import alisson.SpringDataJPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface UserRepository extends JpaRepository<User, Integer> {
}
