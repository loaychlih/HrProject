package com.example.hrproject.Repositories;

import com.example.hrproject.Entities.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaborateursRepository extends
        JpaRepository <Collaborateur, Long> {
}
