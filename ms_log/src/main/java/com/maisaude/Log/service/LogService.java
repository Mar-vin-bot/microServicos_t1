package com.maisaude.Log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maisaude.Log.entities.Action;

import com.maisaude.Log.entities.Log;
import com.maisaude.Log.repositorie.LogRepositorie;

import java.util.List;

@Service
public class LogService {
    
    @Autowired
    private LogRepositorie log;

    public List<Log> findAll(){
        return log.findAll();
    }

    public Log findById(String id){
        return log.findById(id).stream().findFirst().orElse(null);
    }

    public List<Log>findByAction(Action obj){
        return log.findByAction(obj.toString());
    }

    public Log save(Log obj){
        return log.save(obj);
    }


}
