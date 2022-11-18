package com.saude_mais.ms_consulta.Service;


import com.saude_mais.ms_consulta.entities.Action;
import com.saude_mais.ms_consulta.entities.Consulta;
import com.saude_mais.ms_consulta.feigns.ConsultaFeign;
import com.saude_mais.ms_consulta.message.ConsultaSendMenssageLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ConsultaService {

    @Autowired
    ConsultaFeign consultaFeign;

    @Autowired
    ConsultaSendMenssageLog consultaSendMenssageLog;

    public List<Consulta> findAll(){
        return consultaFeign.getAll();
    }

    public Consulta findById(String id){
        var consulta = consultaFeign.getById(id);
        consultaSendMenssageLog.sendMessage(consulta, Action.NONE);
        return consulta;
    }

    public List<Consulta> findByPacienteName(String name){
        return consultaFeign.getByPacienteName(name);
    }

    
}
