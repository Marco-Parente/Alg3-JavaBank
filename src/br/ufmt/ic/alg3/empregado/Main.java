package br.ufmt.ic.alg3.empregado;

/**
 *
 * @author marcoparente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado emp = new Empregado();
        emp.setCpf("000.000.000-00");
        emp.setNome("Wilson");
        emp.setCpts("Carteira");
        emp.setRg("123456-7");
        emp.setSalario(1000);
        emp.setHoras(120);
        
        System.out.println(emp.getNome());
        System.out.println(emp.calcularSalario(-2));
    }
    
}
