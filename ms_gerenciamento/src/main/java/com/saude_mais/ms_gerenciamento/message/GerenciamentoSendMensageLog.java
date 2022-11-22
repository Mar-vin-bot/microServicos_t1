package com.saude_mais.ms_gerenciamento.message;

import com.saude_mais.ms_gerenciamento.entities.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GerenciamentoSendMensageLog {

    @Value("${store.rabbitmq.exchange}")
    String exchange;

    @Value("${store.rabbitmq.log.routingkey}")
    String routingKey;

    @Autowired
    public RabbitTemplate rabbitTemplate;

    public void sendMessageMedico(Medico medico, Action action){

        Medico med = new Medico();

        med.setAction(action);
        med.setId(medico.getId());
        med.setNomeMed(medico.getNomeMed());
        med.setEspecialidade(medico.getEspecialidade());
        med.setCrm(medico.getCrm());

        rabbitTemplate.convertAndSend(exchange, routingKey, med);
    }

    public void sendMessagePaciente(Paciente paciente, Action action){

        Paciente obj = new Paciente();

        obj.setAction(action);
        obj.setNomePac(paciente.getNomePac());
        obj.setTel(paciente.getTel());
        obj.setOcupacao(paciente.getOcupacao());

        rabbitTemplate.convertAndSend(exchange, routingKey, obj);
    }

    public void sendMessageSecretaria(Secretaria secretaria, Action action){

        Secretaria obj = new Secretaria();

        obj.setAction(action);
        obj.setId(secretaria.getId());
        obj.setNomeSec(secretaria.getNomeSec());
        obj.setCpf(secretaria.getCpf());

        rabbitTemplate.convertAndSend(exchange, routingKey, obj);
    }
}




