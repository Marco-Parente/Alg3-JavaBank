/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.info;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author marcoparente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Info i = new Info();
        i.setNome("PatrickStar");
        i.setIdade(2);
        
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("teste.dat")
            );
            oos.writeObject(i);
            oos.close();
            
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("teste.dat")
            );
            Info lido = (Info) ois.readObject();
            System.out.println(lido.getNome());
            System.out.println(lido.getIdade());
            ois.close();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ClassNotFoundException erro) { 
            erro.printStackTrace();
        }
    }
    
}
