package com.saude_mais.ms_agendamento.menssage;


import com.saude_mais.ms_agendamento.entities.Action;
import com.saude_mais.ms_agendamento.entities.Agendamento;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConsultaSendMenssageLog {

    @Value("${store.rabbitmq.exchange}")
    String exchange;


    @Value("${store.rabbitmq.log.routingkey}")
    String routingKey;

    @Autowired
    public RabbitTemplate rabbitTemplate;

    public void sendMessage(Agendamento agendamento, Action action){

        Agendamento obj = new Agendamento();

        obj.setAction(action);
        obj.setId(agendamento.getId());
        obj.setIdPac(agendamento.getIdPac());
        obj.setNomeMedico(agendamento.getNomeMedico());
        obj.setEspecialidadeMedico(agendamento.getEspecialidadeMedico());

        rabbitTemplate.convertAndSend(exchange, routingKey, obj);
    }
}
