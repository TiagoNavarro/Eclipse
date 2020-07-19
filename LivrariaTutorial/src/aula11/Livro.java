/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

    //ANTES PEÇA PARA OS ALUNOS FAZEREM COMPLEMENTAREM A REVENDA DE VEICULSO PARA QUE
    //SEJA POSSIVEL UTILIZAR HERANÇA, ENCAPSULAMENTO, SOBRECARGA DO CONSTRUTOR, SOBREESCRITA
    //DO MÉTODO, VISIBILIDADE PROTECTED, PRIVATE E PUBLIC E GETTERS E SETTERS.
    
    //CONTINUAR NAS PROXIMAS LIÇOES A PARTIR DA PAGINA 84

   /*
    4 Forma

    Deixamos os comportamentos específicos de um Ebook bem
    encapsulados em sua classe, mas repare que há um problema em
    nossa herança. 

    Em que lugar devemos colocar os métodos que fazem sentido
    apenas para um livro físico? Por exemplo, todo livro físico possui uma taxa
    de impressão. 

    Podemos criar um getTaxaImpressao para nos retornar
    esse valor, como a seguir:
    
        public double getTaxaImpressao() {
        return this.getValor() * 0.05;
        }

    Mas onde adicionamos esse método? Se adicionarmos na classe Livro,
    o Ebook herdará esse comportamento que não deveria existir em seu tipo.
    
    Mais uma vez entramos na regra: se um elemento é importante e tem
    regras específicas, ele deve ser representado como um objeto. 

    Podemos
    criar uma nova classe em nosso projeto, para representar tudo o que um
    LivroFisico tem e como ele se comporta. Observe:
    
    public class LivroFisico extends Livro {
    public LivroFisico(Autor autor) {
    super(autor);
    }
    
    public double getTaxaImpressao() {
    return this.getValor() * 0.05;
    }
    }

    Dessa maneira, também temos uma forma forte de representar um
    LivroFisico, bem encapsulada e que não causa nenhum efeito colateral
    nos demais filhos de Livro, como o Ebook.

   */

public class Livro {
  
    protected String nome;
    protected String descricao;
    protected double valor;
    protected String isbn;
    protected Autor autor;
    
    protected boolean impresso;
    
    public Livro(Autor autor) {
        this();
        this.autor=autor;
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
