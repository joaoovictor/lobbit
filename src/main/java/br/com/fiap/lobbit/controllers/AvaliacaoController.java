package br.com.fiap.lobbit.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.lobbit.models.Avaliacao;

@RestController
public class AvaliacaoController {

  @GetMapping("/api/avaliacoes")
  public Avaliacao show(){
    var avaliacao = new Avaliacao();
    return avaliacao;
  }
}
