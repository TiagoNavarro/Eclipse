/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author Tiago
 */
// 4 Forma

// Falar da classe Ebook como abaixo, no codigo na 5 Forma os alunos 
// criar a classe 
// com HERANÇA (EXTENDS)
/*public class Ebook {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private String waterMark;

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

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

}*/

/*
Nosso código já está um poucomais interessante, afinal não estamosmais
sobrecarregando a classe Livro com atributos e métodos que serão utilizados
apenas quando o tipo do livro for um ebook. 

Mas há muito código
repetido aqui: além dos comportamentos do Ebook, temos todos os atributos
e métodos já escritos na classe Livro.

Para evitar toda essa repetição de código, podemos ensinar ao compilador
que o Ebook é um tipo de Livro, ou seja, além de seus próprios atributos e
métodos, essa classe possui tudo o que um Livro tem. 

Para fazer isto, basta
Ebook dizer na declaração da classe que ela éum Livro, que éuma extensão
dessa classe:
*/

// 5 Forma 

//criar a classe com HERANÇA, deixar apenas o que for dela
// pois os outros atributos serão herdados da classe Livro

/*
Ao utilizar a palavra reservada extends, estamos dizendo que um
Ebook (subclasse) herda tudo o que a classe Livro (superclasse) tem. Portanto,
mesmo sem ter nenhum desses métodos declarados diretamente na
classe Ebook, podemos executar o seguinte código sem nenhum problema:

Ebook ebook = new Ebook();      //Crie na classe cadastroDeLivro
ebok.setNome("Java 8 Prático");

Como a classe Livro tem os getters e setters para o atributo nome declarados,
um Ebook também terá.

Herança múltipla
Uma regra importante da herança em Java é que nossas classes só
podem herdar diretamente de uma classe pai. Ou seja, não há herança
múltipla como na linguagem C++. Mas sim, uma classe pode herdar de
uma classe que herda de outra e assim por diante. 

Você pode encadear
a herança de suas classes, no entanto, veremos mais à frente 
que essa estratégia
não é muito interessante por aumentar de mais o acoplamento
entre suas classes.

*/
public class Ebook extends Livro {

    private String waterMark;

    // 6 Forma
    // Deixar para criar o SUPER somente depois de criar toda classe
    // Dai fica mais facil explixar para os alunos conforme linha 119
    public Ebook(Autor autor) {
        super(autor);
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }
}

/*
delegate constructor

Como a classe Livro tinha um construtor obrigando a passagem de
um Autor como parâmetro, ao herdar de um Livro, a classe Ebook
também herdou essa responsabilidade. 

Repare que utilizamos a palavra
super para delegar a responsabilidade para a superclasse que já tem esse
comportamento bem definido.

public Ebook(Autor autor) {
super(autor);
}

*/


