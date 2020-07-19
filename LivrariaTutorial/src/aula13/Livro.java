/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
    Afinal, o que é um Livro agora? Um Ebook ou um LivroFisico?
    
    Na verdade, nenhum dos dois. Um Livro é apenas uma abstração de tudo
    que os diferentes tipos de livro devem ter (herdar) em nossa livraria.

    Ao fazer uma venda, queremos saber ao certo o tipo de livro que está
    sendo vendido, nunca deveríamos permitir a venda de um Livro, mas sim
    de suas subclasses.

    Para nossa sorte, há uma forma bem simples de impedir que a classe
    Livro seja instanciada e utilizada dessa forma: podemos simplesmente adicionar
    em sua declaração o modificador abstract. Repare:
*/
package aula13;

//1 Forma mudado 
//public class Livro { para adicionar abstract

/*
A partir do momento em que tornamos nossa classe abstrata, o compilador
vai impedir que qualquer código tente instanciar um Livro. Por exemplo,
em nosso CadastroDeLivros:
*/
  public abstract class Livro {
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
    
    public boolean aplicaDesconto(double porcentagem){
       //5 Forma foi mudado todo esse codigo abaixo para somente RETURN FALSE
       //Agora que o método aplicaDescontoDe da classe pai sempre retorna
       //false, precisaremos mudar a classe LivroFisico para permitir até 30%
       //de desconto.
       /*if (porcentagem > 0.3){
            return false;
        }
        this.valor -= this.valor*porcentagem;
        return true;
       */
       
       return false;
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
