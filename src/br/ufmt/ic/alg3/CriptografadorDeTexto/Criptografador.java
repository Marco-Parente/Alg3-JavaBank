/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.CriptografadorDeTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcoparente
 */
public class Criptografador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(
                new FileReader("mensagem.txt")
            );
            
            
        
        PrintWriter pw = new PrintWriter ("Criptografada.txt");
                
        int k = 4;
        
        int caracter = br.read();
        
        while(caracter != -1){
            pw.print((char)(caracter+k));
            caracter = br.read();
        }
        
        
        br.close();
        pw.close();
        
        br = new BufferedReader(
            new FileReader("criptografada.txt")
        );
        caracter = br.read();
        String mensagem = "";
        while(caracter!=-1){
            char crip = (char)(caracter-k);
            mensagem+=crip;
            caracter=br.read();
        }
        
        System.out.println(mensagem);
        br.close();
        
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
    
}
