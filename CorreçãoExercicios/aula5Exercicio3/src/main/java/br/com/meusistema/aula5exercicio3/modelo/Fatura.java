/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.meusistema.aula5exercicio3.modelo;

/**
 *
 * @author marcos.luiz
 */
public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;

    // Construtor
    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.setQuantidade(quantidade);
        this.setPrecoPorItem(precoPorItem);
    }

    // Getters e Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
         if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
        //this.quantidade = (quantidade > 0) ? quantidade : 0;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem > 0) {
            this.precoPorItem = precoPorItem;
        } else {
            this.precoPorItem = 0.0;
        }
        //this.precoPorItem = (precoPorItem > 0) ? precoPorItem : 0.0;
    }

    // Método para calcular o valor total da fatura
    public double getTotalFatura() {
        return quantidade * precoPorItem;
    }
    
   public void imprimirFatura(){
        System.out.println("Fatura 1:");
        System.out.println("Número: " + this.numero);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço por item: R$ " + this.precoPorItem);
        System.out.println("Total: R$ " + this.getTotalFatura());
        System.out.println("\n");
   }
}

