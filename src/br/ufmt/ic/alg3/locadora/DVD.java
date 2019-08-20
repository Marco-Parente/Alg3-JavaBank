package br.ufmt.ic.alg3.locadora;

public class DVD {
   private String marca;
   private String modelo;
   private float peso;
   private boolean slim;
   private float preco;
   
   public DVD(String marca, String modelo, float peso, boolean slim, float preco){
       this.marca = marca;
       this.modelo = modelo;
       this.peso = peso;
       this.slim = slim;
       this.preco = preco;
   }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isSlim() {
        return slim;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
   
   public void executar(){
       System.out.println("Executando...");
   }
   
   public void avancar(){
       System.out.println("Avançar...");
   }
   
   public void retroceder(){
       System.out.println("Retroceder...");
   }
   
   public void parar(){
       System.out.println("Parar...");
   }
}
