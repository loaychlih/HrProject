package com.example.hrproject.Repositories;

import com.example.hrproject.Entities.Collaborateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaborateursRepository extends
        JpaRepository <Collaborateurs, Long> {
}
