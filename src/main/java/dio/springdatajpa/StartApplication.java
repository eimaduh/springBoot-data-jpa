package dio.springdatajpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio.springdatajpa.model.User;
import repository.UserRepository;


@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Maria Eduarda");
        user.setUsername("maduh");
        user.setPassword("spring");
        user.setRoles(null);
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}