package br.ufmt.ic.alg3.descontos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Produto> estoque = new ArrayList<Produto>();

        Produto p = new Produto();
        p.setNome("Arroz");
        p.setCompra(5);
        p.setVenda(6);
        estoque.add(p);

        p = new Produto();
        p.setNome("Feijão");
        p.setCompra(3);
        p.setVenda(5);
        estoque.add(p);

        p = new Produto();
        p.setNome("Alface");
        p.setCompra(1);
        p.setVenda(2);
        estoque.add(p);

        p = new Produto();
        p.setNome("Tomate");
        p.setCompra(10);
        p.setVenda(10.5f);
        estoque.add(p);

        p = new Produto();
        p.setNome("Arroz Integral");
        p.setCompra(50);
        p.setVenda(60);
        estoque.add(p);

        for (int i = 0; i < estoque.size(); i++) {
            Produto prod = estoque.get(i);
            System.out.println(prod.getNome() + " = " + prod.getCompra() + " => " + prod.getVenda());
        }

        estoque.stream().forEach((prod) -> System.out.println(prod.getNome() + " = " + prod.getCompra() + " => " + " => " + prod.getVenda()));

        List<Produto> baratos = new ArrayList<Produto>();
        for (int i = 0; i < estoque.size(); i++) {
            Produto prod = estoque.get(i);
            if (prod.getCompra() < 10) {
                baratos.add(prod);
            }
        }

        System.out.println(baratos.size());

        List<Produto> b = estoque.stream().filter((prod)
                -> prod.getCompra() < 10)
                .collect(Collectors.toList());

        List<Produto> lucro10 = estoque.stream()
                .filter((prod)
                        -> ((prod.getVenda() - prod.getCompra()) * 100 / prod.getCompra()) < 10)
                .collect(Collectors.toList());

        System.out.println(lucro10.size());

//        List<Produto> lucro10e20 = estoque.stream()
//                .filter((prod) -> 
//                (((prod.getVenda() - prod.getCompra()) * 100 / prod.getCompra()) > 10)  &&
//                        ((prod.getVenda() - prod.getCompra()) * 100 / prod.getCompra()) <= 20)
//                .collect(Collectors.toList());
//        
//        System.out.println(lucro10e20.size());
        List<Produto> lucro10e20 = estoque.stream()
                .filter((prod) -> {
                    float div = prod.getVenda() / prod.getCompra();
                    return (div > 1.1) && div <= 1.2; 
                }
                )
                .collect(Collectors.toList());

        System.out.println(lucro10e20.size());
    }

}
