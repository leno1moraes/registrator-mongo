package com.registrator.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.registrator.backend.entity.Registrator;

public interface RegistratorRepository extends MongoRepository<Registrator, String> {
    
}
