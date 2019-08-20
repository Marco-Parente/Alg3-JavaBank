package br.ufmt.ic.alg3.equacao;

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
        Equacao1Grau eq;
        eq = new Equacao1Grau(2,3);
        
        Equacao2Grau eq2;
        eq2 = new Equacao2Grau(2,1,2);
        
        Equacao3Grau eq3;
        eq3 = new Equacao3Grau(2,2,1,2);
        
        System.out.println("Equação 1 -> " + eq.calcularY(2));
        System.out.println("Equação 2 -> " + eq2.calcularY2(2));
        System.out.println("Equação 3 -> " + eq3.calcularY3(2));
    }
    
}
