package br.ufmt.ic.alg3.mercadinho;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Produto[] produtos;
        produtos = new Produto[5];
        
        Produto produto;
        produto = new Produto();
        
        
        produto = new Produto();
        produto.setId(1);
        produto.setNome("Adesivo Emagrecedor");
        produto.setPreco(50);
        
        produtos[0] = produto;
        
        
        produto = new Produto();
        produto.setId(2);
        produto.setNome("baralho");
        produto.setPreco(15);
        
        produtos[1] = produto;
        
        
        produto = new Produto();
        produto.setId(3);
        produto.setNome("pamonha");
        produto.setPreco(4);
        
        produtos[2] = produto;
        
        for (int i = 0; i < 3; i++) {
            Produto p = produtos[i];
            System.out.println(p.getNome());
        }
    }
    
}
