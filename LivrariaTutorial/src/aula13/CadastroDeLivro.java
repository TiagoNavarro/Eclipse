/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula13;

/*

Quando uma classe deve ser abstrata?

Quando você for planejar a hierarquia e herança de suas classes, você
verá que algumas classes são bastante específicas e que jamais deveriam
ser instanciadas. 

A classe Animal pode ser vista como um exemplo. O
que exatamente é um Animal? Poderia ser um Leao, um Pinguim ou
qualquer outro Animal do planeta. 

Essa classe pode definir tudo o que
todos os animais têm em comum, mas cada tipo de Animal tem suas
particularidades e deve ser representado de uma forma própria.

A partir do momento em que tornamos nossa classe abstrata, o compilador
vai impedir que qualquer código tente instanciar um Livro. Por exemplo,
em nosso CadastroDeLivros:

O erro de compilação apresentado será:
Cannot instantiate the type Livro

Por que precisamos da classe LIVRO?

Afinal, para que serve a classe Livro, se não podemos mais
instanciá-la? 

Lembre-se que essa classe idealiza tudo o que um Livro
tem, ela ainda está sendo muito útil isolando todos 
os atributos e comportamentos
que são um padrão entre os diferentes tipos de livro. 

A classe
passa a servir exclusivamente para 

herança e polimorfismo, 

que são recursos
bastante úteis e poderosos.

Todo livro criado agora precisa ter seu tipo bem definido, 
portanto precisaremos
mudar todas as partes de nosso código que criava um Livro para
usar uma de suas classes filhas. 

A classe CadastroDeLivros, por exemplo,
ficará assim:

*/
public class CadastroDeLivro {

    public static void main(String[] args) {

        Autor tiago = new Autor();
        tiago.setNome("Tiago");
        tiago.setEmail("tiago@gmail.com");
        tiago.setCpf(12345);

        Autor alex = new Autor();
        alex.setNome("Alex");
        alex.setEmail("alex@gmail.com");
        alex.setCpf(56566);
        
        //2 Forma mudado de Livro matematica = new Livro(alex); para
        Livro matematica = new LivroFisico(alex);
        //Como a classe livro agora é Abstrata mudamos para LivroFisico
        /*
        Apesar de não poder instanciar uma classe abstrata, 
        você ainda pode (e
        muitas vezes deve) usá-la como referência. 
        Como no método adiciona do CarrinhoDeCompras:
        
        public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.16);
        total += livro.getValor();
        }
        
        Repare que ainda estamos recebendo um Livro como parâmetro para
        continuar usando o polimorfismo. Isso é perfeitamente possível, afinal um
        Ebook e um LivroFisico são filhos de Livro, portanto herdam o seu
        tipo.
        */
        matematica.setNome("A matematica e o world");
        matematica.setDescricao("Podemos aprender muito");
        
        matematica.setValor(82.1);
        System.out.println("Valor atual:" +matematica.getValor());
        
        if (!matematica.aplicaDesconto(0.1)){
        System.out.println("Desconto não pode ser maior que 30%");
        }
       
        matematica.setAutor(alex);

        matematica.mostrarDetalhesLivro();
        alex.mostrarDetalhesAutor();

        Livro historia = new LivroFisico(tiago);
        historia.setNome("A historia de hoje");
        historia.setDescricao("Estamos perdidos");
        historia.setValor(50.10);
        historia.setIsbn("188484");

        historia.setAutor(tiago);
        
        historia.mostrarDetalhesLivro();
        tiago.mostrarDetalhesAutor();
    }
}
