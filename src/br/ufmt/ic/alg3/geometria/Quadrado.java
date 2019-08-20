package br.ufmt.ic.alg3.geometria;

/**
 *
 * @author marcoparente
 */
public class Quadrado extends Quadrilatero implements FormaBidimensional {
    private float lado;

    public Quadrado() {
        super(0,0,0,0);
    }
    
    public Quadrado(float lado) {
        super(lado,lado,lado,lado);
    }
    
    
    @Override
    public float calcularArea(){
        return lado*lado;
    }
    
    @Override
    public float calcularPerimetro(){
        return 4*lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    
}
