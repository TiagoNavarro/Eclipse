/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

// Continuando a partir do final da pagina 56 até a 69 do livro (tudo ja feito
// anteriormente)
// Continuando a partir do final da pagina 56 do livro
// Para agora criar uma classe espefífica para RegrasDeDesconto

// Continuando na pagina 70 sobre sobrecargade construtor.
// Explicar esse conceito aos alunos
// Uma classe pode, sim, ter mais de um construtor, isso é conhecido
// como uma sobrecarga (overloaded) de construtor.

// Explicar null aos alunos, se o código ISBN demorar a chegar, não 
// tem problema ficar definido como NULL.

// Pag 72
// Construtores também podem ser inicializados com atributos, como no
// codigo na linha 34 a 42. Neste caso esta zerado por ainda não foi disponibilizado
// um codigo ISBN pra ele.


/**
 *
 * @author Tiago
 */
public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    //4 alteração, comentando este construtor para construr mais 2
    /*
    public Livro(Autor autor) {
        this.autor = autor;
        // 1 Forma
        // adicionado isbn vazio
        this.isbn = "000-00-0000-00-0";
    }
    */

    // 3 Alteração pag 73
    /*
    Repare que, se a classe Livro também tivesse um construtor sem
    argumentos, como a seguir:
    
    public Livro(){
    
    }
    
    O valor de ISBN só seria inicializado quando o construtor com um
    Autor fosse chamado. Para resolver isso, você pode encadear a chamada
    dos construtores utilizando a palavra reservada this, como a seguir:
    */
    
    //Continuação da 3 alteração pag 73
    // O construtor da linha 39 foi comentado, e feito dois novos como a seguir
    
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
