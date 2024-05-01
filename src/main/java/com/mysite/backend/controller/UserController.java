package com.mysite.backend.controller;
import java.util.List;
import com.mysite.backend.db.entity.Customers;
import com.mysite.backend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @GetMapping("/userphoto")
//    public List<String> getUserList() { return (List<String>) userRepository.findAllByPhoto(); }
    @GetMapping("/users")
    public List<Customers> getUsers() {
        return (List<Customers>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody Customers user) {
        userRepository.save(user);
    }

    @RequestMapping("/")
    public String greet(){
        return "welcome!";
    }

}
