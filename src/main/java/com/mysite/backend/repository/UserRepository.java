package com.mysite.backend.repository;

import com.mysite.backend.db.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Customers, Long> {
    List<Customers> findAllByPhoto(String photo);
    @Query(value = "select photo from Customers")
    List<String> findAllByPhoto();

}
