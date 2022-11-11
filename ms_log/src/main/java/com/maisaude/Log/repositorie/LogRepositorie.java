package com.maisaude.Log.repositorie;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maisaude.Log.entities.Log;

import org.springframework.data.mongodb.repository.Query;

import java.util.List;

@Repository
public interface LogRepositorie extends MongoRepository<Log, String> {

    @Query("{action: ?0}")
    public List<Log> findByAction(String action);
    
}
