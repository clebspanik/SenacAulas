/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.meusistema.aula5exercicio2;

import br.com.meusistema.aula5exercicio2.modelo.Pessoa;

/**
 *
 * @author marcos.luiz
 */
public class Aula5Exercicio2 {


    public static void main(String[] args) {
        Pessoa einstein = new Pessoa();
        einstein.setNome("Albert Einstein");
        einstein.atualizarDataDeNascimento(14, 3, 1879);
        einstein.calculaIdade(14, 4, 2025); // data atual de exemplo
        System.out.println(einstein.informaNome() + " tem " + einstein.informaIdade() + " anos.");

        Pessoa newton = new Pessoa();
        newton.setNome("Isaac Newton");
        newton.atualizarDataDeNascimento(4, 1, 1643);
        newton.calcularIdadeSimples(14, 4, 2025); // data atual de exemplo
        System.out.println(newton.informaNome() + " tem " + newton.informaIdade() + " anos.");
    }


}
