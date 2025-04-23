/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.meusistema.aula5exercicio8.modelo;

/**
 *
 * @author marcos.luiz
 */
import java.time.Year;

import java.time.Year;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    // Construtor
    public Carro(String marca, String modelo, int ano, double valor) {
        this.marca = marca;
        this.modelo = modelo;

        int anoAtual = Year.now().getValue();
        if (ano >= 1980 && ano <= anoAtual) {
            this.ano = ano;
        } else {
            this.ano = 2000;
        }

        if (valor > 0) {
            this.valor = valor;
        } else {
            this.valor = 0.0;
        }
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        int anoAtual = Year.now().getValue();
        if (ano >= 1980 && ano <= anoAtual) {
            this.ano = ano;
        } else {
            this.ano = 2000;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            this.valor = 0.0;
        }
    }

    // Método para exibir todos os dados
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.printf("Valor: R$ %.2f%n", valor);
    }
}
