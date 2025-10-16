package com.student.sms;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.sms.model.Student;
import com.student.sms.repository.StudentRepository;

@SpringBootTest
public class StudentRepositoryTests {

    @Autowired
    private StudentRepository repo;

    @Test
    void testAddStudent() {
        Student s = new Student();
        s.setName("Test User");
        s.setClassName("10A");
        s.setMarks(90f);
        repo.save(s);
        assertNotNull(repo.findById(s.getId()));
    }
}
