/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.meusistema.aula5exercicio6;

import br.com.meusistema.aula5exercicio6.modelo.ContaBancaria;

/**
 *
 * @author marcos.luiz
 */
public class Aula5exercicio6 {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ana Clara", "123456-7", 500.00);

        conta.exibirSaldo();

        System.out.println("Depositando R$ 300,00...");
        conta.depositar(300.00);
        conta.exibirSaldo();
        
        System.out.println("Depositando R$ -500,00...");
        conta.depositar(-500.00);
        conta.exibirSaldo();

        System.out.println("Sacando R$ 200,00...");
        conta.sacar(200.00);
        conta.exibirSaldo();

        System.out.println("Tentando sacar R$ 1000,00 (saldo insuficiente)...");
        conta.sacar(1000.00);
        conta.exibirSaldo();
    }
}
