package com.example.onetomany.repositories;

import com.example.onetomany.models.ClassStudentId;
import com.example.onetomany.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.onetomany.models.ClassStudent;

@Repository
public interface ClassStudentRepository extends JpaRepository<ClassStudent, ClassStudentId> {

}
