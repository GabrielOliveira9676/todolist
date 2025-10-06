package br.com.gabrieloliveira.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
// EX: http://localhost:8080/primeiraRota   -------

public class MinhaPrimeiraController {
    /*
     METODOS DE ACESSO DO HTTP
    * GET - BUSCAR INFORMAÇÃO
    * POST - ADICIONAR DADO / INFORMAÇÃO
    * PUT - ALTERAR DADO / INFORMAÇÃO
    * DELETE - REMOVER UM DADO
    * PATCH - ALTERAR SOMENTE UMA PARTE DA INFO / DADO
    *
    * */


    //METODO (FUNCIONALIDADE) DE UMA CLASSE
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {

        return "Funcionou";
    }

}
