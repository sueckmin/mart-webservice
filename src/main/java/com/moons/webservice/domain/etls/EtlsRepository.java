package com.moons.webservice.domain.etls;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface EtlsRepository extends JpaRepository<Etls, EtlsId> {
    @Query("SELECT p " +
            "FROM Etls p "+
            "ORDER BY p.id desc"
    )
    Stream<Etls> findAllDesc();
}
