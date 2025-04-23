/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.meusistema.aula5exercicio5;

import br.com.meusistema.aula5exercicio5.modelo.Produto;

/**
 *
 * @author marcos.luiz
 */
public class Aula5Exercicio5 {

    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse Sem Fio", "A1001", 15, 79.90);
        Produto p2 = new Produto("Monitor 24\"", "A1002", -5, -1200.00); // valores inválidos

        System.out.println("Produto 1:");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Código: " + p1.getCodigo());
        System.out.println("Quantidade: " + p1.getQuantidade());
        System.out.println("Preço unitário: R$ " + p1.getPrecoUnitario());
        System.out.println("Valor total em estoque: R$ " + p1.valorTotalEmEstoque());

        System.out.println("\nProduto 2 (ajustado por validação):");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Código: " + p2.getCodigo());
        System.out.println("Quantidade: " + p2.getQuantidade());
        System.out.println("Preço unitário: R$ " + p2.getPrecoUnitario());
        System.out.println("Valor total em estoque: R$ " + p2.valorTotalEmEstoque());
    }
}
