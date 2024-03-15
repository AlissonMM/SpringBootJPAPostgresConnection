package alisson.SpringDataJPA.repository;

import alisson.SpringDataJPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {
    //JPQL Query Method
    List<User> findByNameContaining(String name);

    //JPQL Query Method
    List<User> findByUserName(String userName);
    List<User> findAll();

    //Query Override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);
}
