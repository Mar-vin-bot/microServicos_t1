package com.saude_mais.ms_consulta.Service;


import com.saude_mais.ms_consulta.entities.Consulta;
import com.saude_mais.ms_consulta.feigns.ConsultaFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ConsultaService {

    @Autowired
    ConsultaFeign consultaFeign;

    public List<Consulta> findAll(){
        return consultaFeign.getAll();
    }

    public Consulta findById(String id){
        return consultaFeign.getById(id);
    }

    public List<Consulta> findByPacienteName(String name){
        return consultaFeign.getByPacienteName(name);
    }

    
}
