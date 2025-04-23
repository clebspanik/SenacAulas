/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.meusistema.aula5exercicio6.modelo;

/**
 *
 * @author marcos.luiz
 */
public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;

        if (saldoInicial > 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
        }
    }

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos operacionais
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Apenas valores positivos são aceitos");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Sem saldo para o valor");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual da conta %s: R$ %.2f%n", numeroConta, saldo);
    }
}

