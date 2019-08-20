/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author marcoparente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8});
        int e = 10;
        
        Main m = new Main();
        System.out.println(m.qtdMaiores(array, e));
        
    }
    
    public int qtdMaiores(List<? extends Comparable<?>> lista, Comparable elem){
        int maiores = 0;
        for (Comparable t : lista) {
            if(t.compareTo(elem) > 0){
                maiores++;
            }
        }
        return maiores;
    }
    
}
