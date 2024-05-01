package com.mysite.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysitebackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysitebackendApplication.class, args);
    }

//    @Bean
//    CommandLineRunner init(UserRepository userRepository) {
//        AtomicInteger a = new AtomicInteger();
//        return args -> {
//            Stream.of("dhiego", "lucas", "paulo").forEach(firstname -> {
//                a.getAndIncrement();
//                Customers user = new Customers(firstname, "silva", firstname.toLowerCase() + "@degussa-goldhandel.de", "giga"+a+".jpg");
//                userRepository.save(user);
//
//            });
//            userRepository.findAll().forEach(System.out::println);
//        };
//    }

}
