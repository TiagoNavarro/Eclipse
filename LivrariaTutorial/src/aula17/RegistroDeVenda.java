/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17;

public class RegistroDeVenda {

    public static void main(String[] args) {

        Autor mauricio = new Autor();
        mauricio.setNome("Mauricio Aniche");

        Ebook ebook = new Ebook(mauricio);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(20);

        LivroFisico fisico = new LivroFisico(mauricio);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(60);
        
        Revista revista = new Revista();
        revista.setNome("Test-Driven Development");
        revista.setValor(20);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
        carrinho.adiciona(revista);
        
        System.out.println("Total " + carrinho.getTotal());
    }
}
