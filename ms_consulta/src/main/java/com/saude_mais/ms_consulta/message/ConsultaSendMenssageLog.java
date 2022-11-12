package com.saude_mais.ms_consulta.message;


import com.saude_mais.ms_consulta.entities.Action;
import com.saude_mais.ms_consulta.entities.Consulta;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class ConsultaSendMenssageLog {

    @Value("${store.rabbitmq.exchange}")
    String exchange;

    @Value("${store.routingkey}")
    String routingKey;

    @Autowired
    public RabbitTemplate rabbitTemplate;

    public void sendMessage(Consulta consulta, Action action) {

        Consulta obj = new Consulta();

        obj.setAction(action);
        obj.setNomePac(consulta.getId());
        obj.setNomeMed(consulta.getNomeMed());
        obj.setDtColsulta(consulta.getDtColsulta());

        rabbitTemplate.convertAndSend(exchange, routingKey, consulta);

    }

}
