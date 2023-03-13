package br.com.fiap.lobbit.controllers;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.lobbit.models.Avaliacao;

@RestController
public class AvaliacaoController { 

  @GetMapping("/api/avaliacoes")
  public Avaliacao show(){
    var avaliacao = new Avaliacao("jogo top joguei por muito tempo, divertido", 5, LocalDate.now());
    return avaliacao;
  }
}
