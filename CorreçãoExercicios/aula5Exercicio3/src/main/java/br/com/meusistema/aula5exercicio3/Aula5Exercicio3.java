/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.meusistema.aula5exercicio3;

import br.com.meusistema.aula5exercicio3.modelo.Fatura;

/**
 *
 * @author marcos.luiz
 */
public class Aula5Exercicio3 {

    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("001", "Teclado Mecânico", 2, 250.00);
        Fatura fatura2 = new Fatura("002", "Mouse Gamer", 3, 150.00); // Testando valores inválidos

        fatura1.imprimirFatura();
        fatura2.imprimirFatura();        
    }
}
