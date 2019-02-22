package com.moons.webservice.domain.emps;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface EmpRepository extends JpaRepository<Emp, EmpId> {


    @Query("SELECT p " +
            "FROM Emp p "
    )
    Stream<Emp> findAllDesc();
}
