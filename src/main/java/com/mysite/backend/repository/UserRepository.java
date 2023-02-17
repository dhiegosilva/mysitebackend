package com.mysite.backend.repository;

import com.mysite.backend.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByPhoto(String photo);
    @Query(value = "select photo from User")
    List<String> findAllByPhoto();

}
