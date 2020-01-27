package com.example.mongodbdemo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EventRepo extends MongoRepository<EventDoc, String> {
    List<EventDoc> findByTitle(String title);
    List<EventDoc> findByImage(String image);

}
