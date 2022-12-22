package com.emilasaga.lavaderomalvin.repositories;

import com.emilasaga.lavaderomalvin.core.wash.model.Wash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface WashRepository extends JpaRepository<Wash, Long> {

    List<Wash> findByClientName(String clientName);
    List<Wash> findByClientLastName(String clientLastName);
    List<Wash> findByCreatedAt(LocalDateTime createdAt);

}
