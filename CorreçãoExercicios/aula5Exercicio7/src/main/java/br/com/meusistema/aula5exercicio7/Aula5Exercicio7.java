/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.meusistema.aula5exercicio7;

import br.com.meusistema.aula5exercicio7.modelo.Livro;

/**
 *
 * @author marcos.luiz
 */
public class Aula5Exercicio7 {

    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 99.90);
        Livro livro2 = new Livro("Códigos Antigos", "Autor Desconhecido", 1200, -50.00); // valores inválidos

        System.out.println("Livro 1:");
        System.out.println("Descrição: " + livro1.getDescricao());
        System.out.println("Preço: R$ " + livro1.getPreco());

        System.out.println("\nLivro 2 (ajustado por validação):");
        System.out.println("Descrição: " + livro2.getDescricao());
        System.out.println("Preço: R$ " + livro2.getPreco());
    }
}
