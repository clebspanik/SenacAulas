/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.meusistema.aula5exercicio7;

import br.com.meusistema.aula5exercicio7.modelo.Livro;
import java.util.Scanner;

/**
 *
 * @author marcos.luiz
 */
public class MainEntradaDados {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primeiro livro
        System.out.println("Informe os dados do primeiro livro:");
        System.out.print("Título: ");
        String titulo1 = scanner.nextLine();
        System.out.print("Autor: ");
        String autor1 = scanner.nextLine();
        System.out.print("Ano de publicação: ");
        int ano1 = scanner.nextInt();
        System.out.print("Preço: ");
        double preco1 = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        Livro livro1 = new Livro(titulo1, autor1, ano1, preco1);

        // Segundo livro
        System.out.println("\nInforme os dados do segundo livro:");
        System.out.print("Título: ");
        String titulo2 = scanner.nextLine();
        System.out.print("Autor: ");
        String autor2 = scanner.nextLine();
        System.out.print("Ano de publicação: ");
        int ano2 = scanner.nextInt();
        System.out.print("Preço: ");
        double preco2 = scanner.nextDouble();

        Livro livro2 = new Livro(titulo2, autor2, ano2, preco2);

        // Exibindo os resultados
        System.out.println("\nLivro 1:");
        System.out.println("Descrição: " + livro1.getDescricao());
        System.out.println("Preço: R$ " + livro1.getPreco());

        System.out.println("\nLivro 2:");
        System.out.println("Descrição: " + livro2.getDescricao());
        System.out.println("Preço: R$ " + livro2.getPreco());

        scanner.close();
    } 
}
