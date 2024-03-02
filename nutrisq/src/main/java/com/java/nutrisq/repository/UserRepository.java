package com.java.nutrisq.repository;

import com.java.nutrisq.model.User;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT DISTINCT u FROM User u")
    List<User> findAllUsers(PageRequest pageRequest); // Changed PageRequest to Pageable

    Optional<User> findOneByEmailAndPassword(String email, String password);

    User findByEmail(String email);
}
