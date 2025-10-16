package com.student.sms.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.sms.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByNameContainingIgnoreCaseOrClassNameContainingIgnoreCase(String nameKeyword, String classKeyword);
}
