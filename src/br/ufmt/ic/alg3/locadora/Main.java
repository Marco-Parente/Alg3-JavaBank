/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.locadora;

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
        DVD dvd;
        dvd = new DVD("XuxaSonic", "Extra", 0.5f, true, 15);
        dvd.executar();
        dvd.avancar();
        dvd.retroceder();
        dvd.parar();
        
    }
    
}
