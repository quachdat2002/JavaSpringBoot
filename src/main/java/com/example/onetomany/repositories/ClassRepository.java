package com.example.onetomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.onetomany.models.Class;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {
}
