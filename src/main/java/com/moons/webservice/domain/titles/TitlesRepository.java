package com.moons.webservice.domain.titles;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface TitlesRepository extends JpaRepository<Titles, Long> {
    /*
    @Query("SELECT p " +
            "FROM Titles p " +
            "ORDER BY p.id desc")
    List<Titles> findAll();
    */

    Page<Titles> findAll(Pageable pageable);

    Titles findById(Long id);

    @Modifying
    @Query("UPDATE Titles p " +
            "SET p.title = :title " +
            "WHERE p.id= :id")
    int update(@Param("id") Long id, @Param("title") String title);
}
