package com.mysite.backend;

import com.mysite.backend.db.entity.User;
import com.mysite.backend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class MysitebackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysitebackendApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("dhiego", "lucas", "paulo").forEach(firstname -> {
                User user = new User(firstname, "silva", firstname.toLowerCase() + "@domain.com", "giga1.jpg");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }

}
