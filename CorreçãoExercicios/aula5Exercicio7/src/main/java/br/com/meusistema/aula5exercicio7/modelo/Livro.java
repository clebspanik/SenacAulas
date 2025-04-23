/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.meusistema.aula5exercicio7.modelo;

/**
 *
 * @author marcos.luiz
 */
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        //Validar data de publicação
        setAnoPublicacao(anoPublicacao);
        //Não aceita preço negativo
        setPreco(preco);
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao >= 1500) {
            this.anoPublicacao = anoPublicacao;
        } else {
            this.anoPublicacao = 1500;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }
    }

    // Método que retorna uma descrição
    public String getDescricao() {
        return titulo + " - " + autor + " (" + anoPublicacao + ")";
    }
}

