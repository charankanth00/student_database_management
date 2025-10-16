package com.student.sms.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.student.sms.model.TestRecord;
import com.student.sms.repository.TestRecordRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final TestRecordRepository testRepo;

    public DataLoader(TestRecordRepository testRepo) {
        this.testRepo = testRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        if (testRepo.count() == 0) {
            testRepo.save(new TestRecord("First Student Record"));
            System.out.println("✅ Inserted test record into MongoDB");
        }
    }
}
