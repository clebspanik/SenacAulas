/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.meusistema.aula5exercicio9.modelo;

/**
 *
 * @author marcos.luiz
 */
public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    // Construtor
    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = (nota1 >= 0) ? nota1 : 0.0;
        this.nota2 = (nota2 >= 0) ? nota2 : 0.0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0) {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0) {
            this.nota2 = nota2;
        }
    }

    // Calcula a média das duas notas
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Verifica situação do aluno com base na média
    public String verificarSituacao() {
        return (calcularMedia() >= 6.0) ? "Aprovado" : "Reprovado";
    }
}

