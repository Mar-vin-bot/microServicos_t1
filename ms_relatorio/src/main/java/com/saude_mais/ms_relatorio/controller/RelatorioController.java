package com.saude_mais.ms_relatorio.controller;

import com.saude_mais.ms_relatorio.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/relatorio")
@RestController
public class RelatorioController {

    @Autowired
    RelatorioService service;

}
