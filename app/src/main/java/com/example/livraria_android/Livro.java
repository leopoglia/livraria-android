package com.example.livraria_android;


public class Livro {

    String nome;
    String sinopse;
    String editora;
    int ano;
    int foto;

    public Livro(String nome, String sinopse,
                 String editora, int ano, int foto){
        this.nome = nome;
        this.sinopse = sinopse;
        this.editora = editora;
        this.ano = ano;
        this.foto = foto;
    }

    public Livro(String nome, int foto){
        this.nome = nome;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
