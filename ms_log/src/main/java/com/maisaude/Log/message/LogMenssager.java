package com.maisaude.Log.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

import com.maisaude.Log.entities.Log;
import com.maisaude.Log.service.LogService;

@Component
public class LogMenssager {

    @Autowired
    private LogService service;

    @RabbitListener(queues = {"${store.rabbitmq.Log.log.queue}"})
    public void receive(@Payload Log obj) {
        service.save(obj);
    }
    
}
