package com.example.demo.repositories;

import com.example.demo.models.Joe;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface JoeRepository extends MongoRepository<Joe, ObjectId> {
}
