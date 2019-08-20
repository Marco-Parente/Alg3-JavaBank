package br.ufmt.ic.alg3.equacao;

/**
 *
 * @author marcoparente
 */
public class Equacao1Grau {
    protected float a, b;
    
    public Equacao1Grau(float a, float b){
        this.a = a;
        this.b = b;
    }
    
    public float calcularY(float x){
        return a*x+b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
}
