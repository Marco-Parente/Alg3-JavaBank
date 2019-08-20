/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.javabank;

/**
 *
 * @author marcoparente
 */
public class ContaBancaria {

    String nome;
    String cpf;
    float saldo;

    ContaBancaria(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    float getSaldo() {
        return saldo;
    }

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setCpf(String cpf) {
        this.cpf = cpf;
    }

    String getCpf() {
        return this.cpf;
    }

    void sacar(float valor) {
        if (valor > 0) {
            if (valor <= getSaldo()) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Você tá pobre irmão!");
            }
        } else {
            System.out.println("Somente valores maiores que zero!");
        }
    }

    void depositar(float valor) {
        if(valor <= 0){
            System.out.println("Somente valores positivos");
        }
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    void exebirSaldo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + getSaldo());
    }
}
