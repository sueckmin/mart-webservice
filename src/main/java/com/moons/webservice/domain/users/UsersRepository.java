package com.moons.webservice.domain.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface UsersRepository extends JpaRepository<Users, UsersPk> {

    @Query("SELECT p " +
            "FROM Users p "
    )
    Stream<Users> findAllDesc();
}
