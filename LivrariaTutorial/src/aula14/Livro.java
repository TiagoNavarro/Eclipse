/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula14;

/* 1 Forma

Se cada novo Livro terá uma estratégia de desconto diferente, ou seja, se
não háumdesconto padrão entre todos os tipos de livro, poderíamos simplesmente
apagar essemétodo dessa classe abstrata e escrevê-lo apenas nas classes
que devem ter desconto. O problema disso é que perderíamos o polimorfismo,
afinal, se ométodo não estiver presente na tipo Livro, o seguinte código não
funcionará:

public void adiciona(Livro livro) {
System.out.println("Adicionando: " + livro);
livro.aplicaDescontoDe(0.16);
total += livro.getValor();
}

Nem todo Livro terá ométodo aplicaDesconto, não há nenhuma
garantia disso.
Podemos resolver o problema de uma forma mais efetiva. Toda classe
abstrata, como é o caso da nossa classe Livro, pode ter métodos abstratos.

Toda classe filha (subclasse) concreta (não abstrata) é obrigada a escrever os
métodos abstratos da classe pai (superclasse), caso contrário seu código não
compilará.

Para tornar o método aplicaDesconto abstrato na classe Livro,
basta adicionar o modificador abstract em sua declaração e remover todo
o corpo, colocando apenas um ponto e vírgula. Repare:
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
    //2 Forma 
    //adicionado abstract e removido return false no metodo abaixo. 
    //Tambem removido as chaves do metodo
    public abstract boolean aplicaDesconto(double porcentagem);
    /*
    A partir do momento em que tornamos o método aplicaDesconto
    abstrato, todas as classes filhas precisam escrevê-lo. Por esse motivo, a classe
    MiniLivro vai parar de compilar.. ir pra la agora.
    */
 
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
