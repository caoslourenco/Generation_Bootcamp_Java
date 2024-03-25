package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/bsm-list")
public class ListBSMController {

    private final List<String> bsmList = Arrays.asList(
            "Proatividade", 
            "Orientação aos detalhes", 
            "Orientação ao futuro", 
            "Responsabilidade pessoal", 
            "Persistência", 
            "Comunicação", 
            "Trabalho em equipe"
    );

    @GetMapping
    public String listBSM() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de BSM's da Generation Brasil: ");
        for (String bsm : bsmList) {
            sb.append(bsm).append("; ");
        }
        return sb.toString();
    }
}
