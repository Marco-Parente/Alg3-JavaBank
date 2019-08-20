package br.ufmt.ic.alg3.naorepete;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author marcoparente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> nomes = new HashMap<String, Integer>();
        
        String linha;
        Scanner in = new Scanner(System.in);
        int qnt;
        
        do {
            System.out.println("Digite um nome: ");
            linha = in.next();
            if (linha.toUpperCase().equals("FIM")){
                break;
            }
            if(nomes.containsKey(linha)){
                qnt = nomes.get(linha) + 1;
                nomes.put(linha, qnt);
                System.out.println("Ja inserido!");
            } else {
                nomes.put(linha, 0);
            }
        } while(!linha.toUpperCase().equals("FIM"));
        
        System.out.println("Removidos:");
        
        
        for(Map.Entry<String, Integer> par : nomes.entrySet()){
            System.out.println(par.getKey() + " = " + par.getValue());
        }
        
    }
    
}
