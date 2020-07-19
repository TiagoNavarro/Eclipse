/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula17;

  public abstract class Livro implements Produto {
    protected String nome;
    protected String descricao;
    protected double valor;
    protected String isbn;
    protected Autor autor;
    
    
    public Livro(Autor autor) {
        this();
        this.autor=autor;
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
   
    public abstract boolean aplicaDesconto(double porcentagem);
 
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
