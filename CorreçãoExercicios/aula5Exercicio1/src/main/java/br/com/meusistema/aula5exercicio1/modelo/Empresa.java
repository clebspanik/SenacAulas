/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.meusistema.aula5exercicio1.modelo;

import java.time.LocalDate;

/**
 *
 * @author marcos.luiz
 */
public class Empresa {
    private String nome,endereco,cnpj;
    private LocalDate datafundacao;
    private double faturamento;

    public Empresa(String nome, String endereco, String cnpj, LocalDate datafundacao, double faturamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.datafundacao = datafundacao;
        this.faturamento = faturamento;
    }
            
    public void imprimirDadosEmpresa(){
        System.out.println("Nome:" + nome);
        System.out.println("Endereço:" + endereco);
        System.out.println("CNPJ:" + cnpj);
        System.out.println("Data de fundação:" + datafundacao);
        System.out.println("Faturamento:" + faturamento);
        System.out.println("\n");
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
}
