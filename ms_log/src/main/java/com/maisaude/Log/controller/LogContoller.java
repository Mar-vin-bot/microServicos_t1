package com.maisaude.Log.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maisaude.Log.entities.Action;
import com.maisaude.Log.entities.Log;
import com.maisaude.Log.service.LogService;



@RestController
@RequestMapping("/log-plano")
public class LogContoller {

    @Autowired
    private LogService service;

    @GetMapping
    public List<Log> findAll(){
        return service.findAll();
    }

    @GetMapping(value="/id/{id}")
    public Log findById (@PathVariable String id) {
        return service.findById(id);
    }

    @GetMapping("/action/{action}")
    public List<Log> findByAction(Action action){
        return service.findByAction(action);
    }
    

    
}
