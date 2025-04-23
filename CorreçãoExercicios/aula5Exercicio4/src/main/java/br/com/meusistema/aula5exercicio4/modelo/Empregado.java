/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.meusistema.aula5exercicio4.modelo;

/**
 *
 * @author marcos.luiz
 */
public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal); // Garante que a regra de salário válido seja aplicada
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = (salarioMensal > 0) ? salarioMensal : 0.0;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            salarioMensal += salarioMensal * (percentual / 100);
        }
    }
    
    public void imprimirDados(){
        System.out.printf("%s %s: R$ %.2f%n", nome, sobrenome, salarioMensal);        
    }
    
}

