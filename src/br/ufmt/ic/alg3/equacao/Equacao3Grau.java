package br.ufmt.ic.alg3.equacao;

/**
 *
 * @author marcoparente
 */
public class Equacao3Grau extends Equacao2Grau {
    protected float d;

    public Equacao3Grau(float a, float b, float c, float d) {
        super(a, b, c);
        this.d = d;
    }
    
    public float calcularY3(float x){
        return x*super.calcularY2(x)+d;
    }
    

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }
}
