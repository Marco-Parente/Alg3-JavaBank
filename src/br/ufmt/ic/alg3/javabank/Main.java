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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBancaria conta;
        conta = new ContaBancaria("Marco Antônio Parente Nunes", "05283921158");
        
        conta.sacar(-200000);
        
        conta.exebirSaldo();
    }
    
}
