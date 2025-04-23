/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.meusistema.aula5exercicio4;

import br.com.meusistema.aula5exercicio4.modelo.Empregado;

/**
 *
 * @author marcos.luiz
 */
public class Aula5Exercicio4 {

    public static void main(String[] args) {
        // Criando dois empregados
        Empregado emp1 = new Empregado("João", "Silva", 3000.00);
        Empregado emp2 = new Empregado("Maria", "Oliveira", 4500.00);
        
        System.out.println("Salário anual dos empregados antes do aumento:");
        emp1.imprimirDados();
        emp2.imprimirDados();

        // Aumentando o salário em 10%
        emp1.aumentarSalario(5);
        emp2.aumentarSalario(35);

        System.out.println("\nSalário anual dos empregados após 10% de aumento:");
        emp1.imprimirDados();
        emp2.imprimirDados();
    }
}
