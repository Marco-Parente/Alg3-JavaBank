package br.ufmt.ic.alg3.bancouniversal;

/**
 *
 * @author marcoparente
 */
public class Conta {
    private String nome;
    private String numero;
    private float saldo;
    
    public Conta(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0;
    }
    
    public float sacar(float valor) throws ValorInvalidoException {
        if(valor <= 0){
            throw new ValorInvalidoException();
        }
        if(saldo < valor){
            throw new RuntimeException("Saldo insuficiente");
        }
        saldo -= valor;
        return saldo;
    }
    
    public float depositar(float valor) throws ValorInvalidoException {
        if (valor <= 0){
            throw new ValorInvalidoException();
        }
        saldo += valor;
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
