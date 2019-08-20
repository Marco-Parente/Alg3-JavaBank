/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.empregado;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author marcoparente
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado e = new Empregado();
        e.setNome("seila");
        e.setSalario(20000);
        
        try{
            Class classe = Class.forName("br.ufmt.ic.alg3.empregado.Empregado");
            
            Object p2 = classe.newInstance();
            
            Field f = classe.getDeclaredField("nome");
            
            String setNome = "set"+Character.toUpperCase(f.getName().charAt(0))+f.getName().substring(1);
            
            Method set = classe.getDeclaredMethod(setNome, String.class);
            
            set.invoke(p2, "loco");
            
            Method get = classe.getDeclaredMethod("getNome");
            
            System.out.println(get.invoke(p2));
        } catch (Exception err){
            err.printStackTrace();
        }
        
    }
    
}
