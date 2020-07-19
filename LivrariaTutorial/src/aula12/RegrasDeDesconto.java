/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

public class RegrasDeDesconto {

    public static void main(String[] args) {

        Autor joaquim = new Autor();
        joaquim.setNome("Joaquim Felix");

        Livro fisica = new Livro(joaquim);
        fisica.setValor(59.90);
        fisica.setNome("O livro de fisica");

        //Campo encapsulado
        System.out.println("O valor atual: " + fisica.getValor());

        if (!fisica.aplicaDesconto(0.3)) {
            System.out.println("Desconto no livro não pode ser maior do que 30%");
        } else {
            System.out.println("Valor do livro com desconto: "
                    + fisica.getValor());
        }
        Ebook ebook = new Ebook(joaquim);
        ebook.setValor(29.90);
        if (!ebook.aplicaDesconto(0.3)) {
            System.out.println("Desconto no ebook não pode ser maior do que 15%");
        } else {
            System.out.println("Valor do ebook com desconto: " + ebook.getValor());
        }
    }
}
