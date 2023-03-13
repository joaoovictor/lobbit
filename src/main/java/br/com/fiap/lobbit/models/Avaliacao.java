package br.com.fiap.lobbit.models;

import java.time.LocalDate;

public class Avaliacao {
    private String textoAvaliacao;
    private int qtdStar;
    private LocalDate data;

    public Avaliacao(String avaliacao, int qtdStar, LocalDate data) {
      this.textoAvaliacao = avaliacao;
      this.qtdStar = qtdStar;
      this.data = data;
    }

    public String getAvaliacao() {
      return textoAvaliacao;
    }

    public void setAvaliacao(String textoAvaliacao) {
      this.textoAvaliacao = textoAvaliacao;
    }

    public int getQtdStar() {
      return qtdStar;
    }

    public void setQtdStar(int qtdStar) {
      this.qtdStar = qtdStar;
    }

    public LocalDate getData() {
      return data;
    }

    public void setData(LocalDate data) {
      this.data = data;
    }

    @Override
    public String toString(){
      return "Avaliação: [textoAvaliação " + textoAvaliacao + "qtdStar: " + qtdStar + "data: " + data +"]";
    }
    
  
}
