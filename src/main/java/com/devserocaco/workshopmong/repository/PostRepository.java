package com.devserocaco.workshopmong.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devserocaco.workshopmong.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}