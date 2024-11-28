package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "Hello world!!!";
    }

    @GetMapping("/bsm")
    public List<String> getBsm(){
        List<String> bsm = new ArrayList<>();
        bsm.add("23.4 - BSM-CH1 - Desafio BSM 1: Criando um Vídeo BSM \n" +
                "23.4 - BSM-CH1 - Sessão Síncrona com Instrutor/a/e \n" +
                "23.5 - SSM-OM - Mentoria Aberta (60 min)\n" +
                "23.5 - SSM-OM - Sessão Síncrona com Instrutor/a/e \n" +
                "23.6 - RR-DR - Protocolo de Reflexão Diária \n" +
                "23.6 - RR-DR - Sessão Síncrona com Instrutor/a/e \n"
                );
        return bsm;
    }

    @GetMapping("/learning-list")
    public List<String> getLearningList() {
        List<String> learningList = new ArrayList<>();
        learningList.add("Spring Framework");
        learningList.add("Hibernate ORM");
        learningList.add("REST APIs");
        learningList.add("Microserviços MVC");
        return learningList;
    }
}
