package com.example.onetomany.services.impl;

import com.example.onetomany.inputs.StudentDataInput;
import com.example.onetomany.mappers.SchoolMapper;
import com.example.onetomany.mappers.StudentMapper;
import com.example.onetomany.models.School;
import com.example.onetomany.models.Student;
import com.example.onetomany.outputs.StudentDataOutput;
import com.example.onetomany.repositories.SchoolRepository;
import com.example.onetomany.repositories.StudentRepository;
import com.example.onetomany.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final SchoolRepository schoolRepository;

    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper, SchoolRepository schoolRepository) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
        this.schoolRepository = schoolRepository;
    }

    /**
     * Muốn add student phải biết được schoolId của student đó
     * Tìm School trong database dựa vào schoolId được nhập trên PathVariable
     * Nếu không có School thì trả về null
     * Nếu tồn tại School thì thiết lập đối tượng School đó cho thuộc tính school của model Student bằng phương thức setSchool()
     * Sau đó lưu model Student vào database
     * Trả về StudentDataOutput
     * **/
    @Override
    public Student insertStudent(StudentDataInput input, Long schoolId) {
        Optional<School> school = schoolRepository.findById(schoolId);
        if (school.isPresent()) {
            Student student = studentMapper.studentDataInputToStudent(input,null);
            student.setSchool(school.get());
            studentRepository.save(student);
            return student;
        }
        return null;
    }

    @Override
    public StudentDataOutput deleteStudent( Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isEmpty()) {
            return null;
        }
        studentRepository.deleteById(id);
        return new StudentDataOutput(student.get().getId(),student.get().getNameStudent(),student.get().getAgeStudent(),student.get().getSchool());
    }

    @Override
    public List<StudentDataOutput> getListStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(studentMapper::studentToStudentDataOutput).toList();
    }
}