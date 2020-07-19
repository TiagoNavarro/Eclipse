/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;


public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        /*
        Além disso, antes de acumular o total da compra, o método adiciona
        aplicará um desconto de 5% para cada livro adicionado:
        */
        livro.aplicaDesconto(0.05);
        /*
        Operadores de atribuição
        += equivale x = x + x
        -= equivale x = x - x
        *= equivale x = x * x
        /= equivale x = x / x
        %= equivale x = x % x
        */
        total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }
}
