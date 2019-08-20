package br.ufmt.ic.alg3.ponto2d;

/**
 *
 * @author marcoparente
 */
public class Ponto2D {
    protected double x;
    protected double y;
    
    
    Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    Ponto2D(){
        this(0,0);
    }
    
    Ponto2D(Ponto2D ponto){
        this(ponto.x, ponto.y);
    }

    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
