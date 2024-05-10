package com.example.onetomany.services.impl;

import com.example.onetomany.inputs.ClassStudentDataInput;
import com.example.onetomany.mappers.ClassStudentMapper;
import com.example.onetomany.models.ClassStudentId;
import com.example.onetomany.models.Student;
import com.example.onetomany.outputs.ClassStudentDataOutput;
import com.example.onetomany.repositories.ClassRepository;
import com.example.onetomany.repositories.ClassStudentRepository;
import com.example.onetomany.repositories.StudentRepository;
import com.example.onetomany.services.ClassStudentService;
import com.example.onetomany.models.ClassStudent;
import com.example.onetomany.models.Class;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassStudentServiceImpl implements ClassStudentService {

    private final ClassStudentRepository classStudentRepository;
    private final ClassStudentMapper classStudentMapper;
    private final ClassRepository classRepository;
    private final StudentRepository studentRepository;

    public ClassStudentServiceImpl(ClassStudentRepository classStudentRepository, ClassStudentMapper classStudentMapper, ClassRepository classRepository, StudentRepository studentRepository) {
        this.classStudentRepository = classStudentRepository;
        this.classStudentMapper = classStudentMapper;
        this.classRepository = classRepository;
        this.studentRepository = studentRepository;
    }


    @Override
    public ClassStudentDataOutput addClassStudent(ClassStudentDataInput input, Long studentId, Long classId) {
        Optional<Class> clazz = classRepository.findById(classId);
        Optional<Student> student = studentRepository.findById(studentId);
        if (clazz.isEmpty() || student.isEmpty()) {
            return null;
        }
        //khởi tạo ClassStudentId để nhét vào đối tượng classStudent
        ClassStudentId classStudentId = new ClassStudentId();
        //thiết lập ClassId
        classStudentId.setClassId(clazz.get().getId());
        //thiết lập StudentId
        classStudentId.setStudentId(student.get().getId());
        ClassStudent classStudent = classStudentMapper.inputToClassStudent(input,clazz.get(),student.get());
        classStudent.setClassStudentId(classStudentId);
        classStudentRepository.save(classStudent);
        return new ClassStudentDataOutput(classStudent.getClassStudentId(),classStudent.getClazz(),classStudent.getStudent(),classStudent.getSubject());
    }
}
