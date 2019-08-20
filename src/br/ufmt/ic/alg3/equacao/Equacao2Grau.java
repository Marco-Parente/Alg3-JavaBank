package br.ufmt.ic.alg3.equacao;

/**
 *
 * @author marcoparente
 */
public class Equacao2Grau extends Equacao1Grau {
    protected float c;
    
    public Equacao2Grau(float a, float b, float c){
        super(a,b);
        this.c = c;
    }
    
    public float calcularY2(float x) {
        return x*super.calcularY(x)+c;
    }
    
    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    
}
