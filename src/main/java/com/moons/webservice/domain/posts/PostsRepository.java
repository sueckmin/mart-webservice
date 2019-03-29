package com.moons.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    /*
    @Query("SELECT p " +
            "FROM Posts p " +
            "ORDER BY p.id desc")
    Stream<Posts> findAllDesc();
    */
    Posts findById(Long id);

    @Modifying
    @Query("UPDATE Posts p " +
            "SET p.title = :title " +
            ",p.content= :content " +
            "WHERE p.id= :id")
    int update(@Param("id") Long id,@Param("title") String title,@Param("content") String content);

    @Modifying
    @Query("UPDATE Posts p " +
            "SET p.views = p.views + 1 " +
            "WHERE p.id= :id")
    int view(@Param("id") Long id);

}
