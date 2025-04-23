/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.meusistema.aula5exercicio9;

import br.com.meusistema.aula5exercicio9.modelo.Aluno;

/**
 *
 * @author marcos.luiz
 */
public class Aula5Exercicio9 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos Henrique", "A123", 7.5, 8.0);
        Aluno aluno2 = new Aluno("Larissa Souza", "B456", 5.0, 4.5);

        System.out.println("Aluno 1: " + aluno1.getNome());
        System.out.printf("Média: %.2f - Situação: %s%n", aluno1.calcularMedia(), aluno1.verificarSituacao());

        System.out.println("\nAluno 2: " + aluno2.getNome());
        System.out.printf("Média: %.2f - Situação: %s%n", aluno2.calcularMedia(), aluno2.verificarSituacao());

    }
}
