/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;


public class RegistroDeVenda {

    public static void main(String[] args) {

        Autor mauricio = new Autor();
        mauricio.setNome("Mauricio Aniche");

        Ebook ebook = new Ebook(mauricio);
        ebook.setNome("Test-Driven Development");

        LivroFisico fisico = new LivroFisico(mauricio);
        fisico.setNome("Test-Driven Development");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
        System.out.println("Total " + carrinho.getTotal());
    }
}
