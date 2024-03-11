package alisson.SpringDataJPA;

import alisson.SpringDataJPA.model.User;
import alisson.SpringDataJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        List<User> users = repository.filtrarPorNome("Test");
//        List<User> users = repository.findByUserName("testerson");
        List<User> users = repository.findByNameContaining("Alisson");


        users.forEach(System.out::println);
    }

    private void insertUser(){
        User user = new User();
        user.setName("Alisson");
        user.setUserName("alsso");
        user.setPassword("passwordIsMilk123");

        User user2 = new User();
        user2.setName("Alisson Mayer Medeji");
        user2.setUserName("alisson");
        user2.setPassword("23453454v");
//        System.out.println(user);

        User user3 = new User();
        user3.setName("Test");
        user3.setUserName("testerson");
        user3.setPassword("0password'_'");

        repository.save(user);
        repository.save(user2);
        repository.save(user3);

//        for (User u: repository.findAll()){
//            System.out.println(u);
//        }
    }
}
