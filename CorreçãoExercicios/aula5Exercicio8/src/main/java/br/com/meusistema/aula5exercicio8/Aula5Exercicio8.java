/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.meusistema.aula5exercicio8;

import br.com.meusistema.aula5exercicio8.modelo.Carro;

/**
 *
 * @author marcos.luiz
 */
public class Aula5Exercicio8 {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, 120000.00);
        Carro carro2 = new Carro("Fiat", "147", 1975, -5000.00); // ano e valor inválidos

        System.out.println("Carro 1:");
        carro1.exibirDetalhes();

        System.out.println("\nCarro 2 (ajustado por validação):");
        carro2.exibirDetalhes();

        // Alterando valor dos carros
        System.out.println("\nAlterando os valores...");
        carro1.setValor(125000.00);
        carro2.setValor(18000.00);

        System.out.println("\nCarro 1 (valor alterado):");
        carro1.exibirDetalhes();

        System.out.println("\nCarro 2 (valor alterado):");
        carro2.exibirDetalhes();
    }
}
