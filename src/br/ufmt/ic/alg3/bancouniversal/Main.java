package br.ufmt.ic.alg3.bancouniversal;

/**
 *
 * @author marcoparente
 */
public class Main {
    public static void main(String[] args) {
        Conta c;
        c = new Conta("Wolverine", "X-Men");
        try{
            c.sacar(2);
        } catch (ValorInvalidoException erro){
            System.out.println("ó deu erro");
            erro.printStackTrace();
        } catch (Exception erro) {
            System.out.println("Erro desconhecido");
            erro.printStackTrace();
        }
        try{
            c.sacar(2);
        } catch (ValorInvalidoException erro){
            System.out.println("ó deu erro");
            erro.printStackTrace();
        } catch (Exception erro) {
            System.out.println("Erro desconhecido");
            erro.printStackTrace();
        }
        try{
            c.sacar(2);
        } catch (ValorInvalidoException erro){
            System.out.println("ó deu erro");
            erro.printStackTrace();
        } catch (Exception erro) {
            System.out.println("Erro desconhecido");
            erro.printStackTrace();
        }
        try{
            c.sacar(2);
        } catch (ValorInvalidoException erro){
            System.out.println("ó deu erro");
            erro.printStackTrace();
        } catch (Exception erro) {
            System.out.println("Erro desconhecido");
            erro.printStackTrace();
        }
    }
    
}
