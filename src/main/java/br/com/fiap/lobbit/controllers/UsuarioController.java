package br.com.fiap.lobbit.controllers;

import java.time.LocalDate;

import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.lobbit.models.Usuario;

@RestController
public class UsuarioController {

  @GetMapping("/api/usuarios")
  public Usuario show(){
    Usuario u = new Usuario("joao_olli@hotmail.com", "João Victor Oliveira", "*******", "joaoovictor", "PC", "CSGO", "Sou um player mt mas mt noob. dcp.", LocalDate.now());
    return u;
  }
}
