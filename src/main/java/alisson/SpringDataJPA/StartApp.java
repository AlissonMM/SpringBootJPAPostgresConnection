package alisson.SpringDataJPA;

import alisson.SpringDataJPA.model.User;
import alisson.SpringDataJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Alisson");
        user.setUserName("alsso");
        user.setPassword("passwordIsMilk123");
//        System.out.println(user);

        repository.save(user);

        for (User u: repository.findAll()){
            System.out.println(u);
        }



    }
}
