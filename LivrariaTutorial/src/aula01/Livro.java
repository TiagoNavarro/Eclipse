/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

/**
 *
 * @author Tiago
 */
public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public Livro(Autor autor) {
        this.autor = autor;
    }

    void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        System.out.println("Mostrando o autor ");
        System.out.println("Nome: " + autor.nome);
        System.out.println("E-mail: " + autor.email);
        System.out.println("CPF: " + autor.cpf);
        System.out.println("--");
    }
}
