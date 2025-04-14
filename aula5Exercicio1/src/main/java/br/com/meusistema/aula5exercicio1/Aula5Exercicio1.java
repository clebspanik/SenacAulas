/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.meusistema.aula5exercicio1;

import br.com.meusistema.aula5exercicio1.modelo.Empresa;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author marcos.luiz
 */
public class Aula5Exercicio1 {

    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Doces da Ana",
                "Rua 25", "111.111.111/0001-11", LocalDate.of(2025, 4, 14)
                , 5000.00);
        empresa1.imprimirDadosEmpresa();
        Empresa empresa2 = new Empresa("Bebidas da Zé",
                "Rua alta", "999.555.111/0001-11", LocalDate.of(2024, 10, 11)
                , 2000.00);
        empresa2.imprimirDadosEmpresa();
        
        empresa1.setFaturamento(20000.00);
        System.out.println("Faturamento alterado: " + empresa1.getNome());
        System.out.println("\n");
        empresa1.imprimirDadosEmpresa();
    }
}
