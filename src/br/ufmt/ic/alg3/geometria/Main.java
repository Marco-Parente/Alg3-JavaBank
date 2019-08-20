package br.ufmt.ic.alg3.geometria;

/**
 *
 * @author marcoparente
 */
public class Main {

    public static void main(String[] args) {
        Forma a = new Quadrado(2);
        
        if (a instanceof FormaBidimensional) {
            FormaBidimensional b = (FormaBidimensional) a;
            System.out.println(b.calcularPerimetro());
        }
        System.out.println(a.calcularArea());
        
        float soma = 0;
        for(int i =0; i <30000000; i++){
            soma +=0.1;
        }
        System.out.println(soma);
    }

}
