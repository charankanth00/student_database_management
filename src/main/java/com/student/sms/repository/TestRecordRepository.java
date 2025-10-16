package com.student.sms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student.sms.model.TestRecord;

@Repository
public interface TestRecordRepository extends MongoRepository<TestRecord, String> {
}
