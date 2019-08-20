package br.ufmt.ic.alg3.empregado;

/**
 *
 * @author marcoparente
 */
public class Empregado {
    private String nome, cpf, rg, cpts;
    private float salario, horas;
    
    public float calcularSalario(int dias) {
        if( dias >= 0  && dias <= 20 ) {
            return (float)dias/20*salario;
        } else {
            System.err.println("Para de xitar");
            return 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpts() {
        return cpts;
    }

    public void setCpts(String cpts) {
        this.cpts = cpts;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }
    
}
