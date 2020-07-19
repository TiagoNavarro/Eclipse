/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17;

public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDesconto(0.00);
        total += livro.getValor();
    }
  
    public void adiciona(Revista revista) {
        System.out.println("Adicionando: " + revista);
        revista.aplicaDesconto(0.00);
        total += revista.getValor();
    }
    
    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }
}
