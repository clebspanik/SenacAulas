/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.meusistema.aula5exercicio2.modelo;

/**
 *
 * @author marcos.luiz
 */
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    public void atualizarDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }

    public void calcularIdadeSimples(int diaAtual, int mesAtual, int anoAtual) {
        this.idade = anoAtual - this.anoNascimento;

        // Ajusta se a pessoa ainda não fez aniversário no ano atual
        if (mesAtual < this.mesNascimento
                || (mesAtual == this.mesNascimento && diaAtual < this.diaNascimento)) {
            this.idade--;
        }
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        LocalDate nascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        this.idade = Period.between(nascimento, dataAtual).getYears();
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
