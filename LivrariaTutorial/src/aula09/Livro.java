/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

import aula09.*;

// Pag 75 Herança e Polimorfismo
/**
 *
 * @author Tiago
 */
/*
Por causa da sua praticidade e fácil portabilidade, muitos leitores preferem
livros digitais (e-books) aos livros físicos. 

Nossa livraria não pode ficar para
trás, portanto, passaremos a trabalhar com esse novo tipo de livro.

Mas, afinal, como podemos diferenciar um Livro impresso de um
Ebook? Uma forma simples de fazer isso seria adicionando um atributo que
define o tipo de livro. 

Poderia simplesmente ser um boolean, marcando se
um livro é impresso ou não. Repare:
*/

public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    
    // essas alterações são exemplos, pois iremos construir uma classe chamada
    // Ebook, pois tem muitas caracteristicas suas.
    
    // 1 Forma
    // adicionando boolean para deixar um livro como impresso ou nao
    private boolean impresso;
    
    public Livro(Autor autor) {
        this();
        this.autor=autor;
        // 2 Forma
        // Todo Livro que não tenha o valor de impresso definido
        // sera considerado um livro impresso.
        // adicionando no construtor
        this.impresso = true;
    }
    
    public Livro() {
        this.isbn = "000-00-0000-00-0";
    }
    
    void mostrarDetalhesLivro() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());
    }
    /* 3 Forma
    Ao inves de colocar dados no Ebook aqui, foi fazer isso na classe Ebook
    que sera criada, dai sobescrito o metodo.
    
    Além disso, existem alguns comportamentos e atributos que só servem
    para um Ebook. 
    
    Um deles é o watermark (marca d’água). Essa é a forma
    de identificar discretamente o nome e e-mail do dono daquele livro digital,
    normalmente no rodapé das páginas.
    
    Se Ebook éumelemento importante, possui comportamentos e atributos
    específicos, ele deveria ser representado como um Objeto e uma classe só pra ele! 
    
    Podemos criar
    uma classe Ebook definindo os atributos e comportamentos específicos desse
    novo tipo.
    */
    
    public boolean aplicaDesconto(double porcentagem){
        if (porcentagem > 0.3){
            return false;
        }
        this.valor -= this.valor*porcentagem;
        return true;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
}
