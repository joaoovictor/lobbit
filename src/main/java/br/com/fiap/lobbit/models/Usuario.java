package br.com.fiap.lobbit.models;

import java.time.LocalDate;

public class Usuario {
  private String email, nome, senha, nickname, plataformaPreferida, jogoPreferido, descricaoPlayer;
  private LocalDate data;

  

  public Usuario(String email, String nome, String senha, String nickname, String plataformaPreferida,
    String jogoPreferido, String descricaoPlayer, LocalDate data) {
    this.email = email;
    this.nome = nome;
    this.senha = senha;
    this.nickname = nickname;
    this.plataformaPreferida = plataformaPreferida;
    this.jogoPreferido = jogoPreferido;
    this.descricaoPlayer = descricaoPlayer;
    this.data = data;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
  public String getPlataformaPreferida() {
    return plataformaPreferida;
  }
  public void setPlataformaPreferida(String plataformaPreferida) {
    this.plataformaPreferida = plataformaPreferida;
  }
  public String getJogoPreferido() {
    return jogoPreferido;
  }
  public void setJogoPreferido(String jogoPreferido) {
    this.jogoPreferido = jogoPreferido;
  }
  public String getDescricaoPlayer() {
    return descricaoPlayer;
  }
  public void setDescricaoPlayer(String descricaoPlayer) {
    this.descricaoPlayer = descricaoPlayer;
  }
  public LocalDate getData() {
    return data;
  }
  public void setData(LocalDate data) {
    this.data = data;
  }
  @Override
  public String toString() {
    return "Usuario [email=" + email + ", nome=" + nome + ", senha=" + senha + ", nickname=" + nickname
        + ", plataformaPreferida=" + plataformaPreferida + ", jogoPreferido=" + jogoPreferido + ", descricaoPlayer="
        + descricaoPlayer + ", data=" + data + "]";
  }

  
}
