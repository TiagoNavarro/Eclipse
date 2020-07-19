/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15;
//3 Forma

/*
    Precisamos agora evoluir nosso CarrinhoDeCompras para que seja
    possível, além de Livros, adicionar Revistas. Uma solução seria duplicar
    seu método adiciona:
*/
public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDesconto(0.05);
        total += livro.getValor();
    }
    //4 Forma
    //Adicionando um novo metodo para revista
    public void adiciona(Revista revista) {
        System.out.println("Adicionando: " + revista);
        revista.aplicaDesconto(0.05);
        total += revista.getValor();
    }

    /*5 Forma
    Mas note como os dois métodos ficaram bastante parecidos, há muita
    repetição de código! Além disso, para cada novo produto precisaríamos criar
    um novo método, o que tornaria trabalhosa a evolução dessa classe.
    
    Poderíamos fazer a classe Revista herdar de Livro, de modo que o
    polimorfismo seria aplicável e teríamos um único método adiciona. Mas ao
    fazer isso toda Revista teria um Autor, ISBN além dos demais atributos e
    comportamentos que só se aplicampara os Livros, uma verdadeira bagunça.
    
    Sim, podemos criar um nível a mais na hierarquia de nossas classes
    adicionando a classe Produto, assim Livro e Revista herdariam de
    Produto e poderíamos utilizar esse tipo no polimorfismo. A hierarquia de
    nossas classes seria: Ver desenho pagina 107 e colocar no quadro
    
    O grande problema dessa abordagem é que aumentaria demais o acoplamento
    entre as classes, ou seja, o quanto uma classe depende da outra. A
    herança cria uma relação muito forte entre as classes. 
    
    Ao mudar a classe
    Produto, por exemplo, todas as subclasses (e também subclasses das subclasses)
    seriam influenciadas.
    
    E se eu quiser aplicar a mudança apenas para algumas classes? Teríamos
    que sobrescrever esse novo comportamento de uma forma desnecessária em
    todas as outras, assim como fizemos com a classe MiniLivro. 
    
    Mesmo sem
    existir desconto para essa classe, ela foi obrigada a sobrescrever o método
    aplicaDescontoDe para apenas retornar false.
    Com o passar do tempo, o uso da herança faz com que nossas classes
    fiquem cada vez mais acopladas e isso dificulta sua evolução.
    
    Com o passar do tempo, o uso da herança faz com que nossas classes
    fiquem cada vez mais acopladas e isso dificulta sua evolução.
    
    */
    public double getTotal() {
        return total;
    }
}
