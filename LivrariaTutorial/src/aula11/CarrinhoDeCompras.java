/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Tiago
 *
 * 7 Forma - Explicando Polimorfismo
 *
 * Criar classe Carrinho de compras conforme pagina 88 ate 89
 *
 * Vamos agora criar a classe CarrinhoDeCompras e seu método adiciona.
 *
 * Como vamos adicionar LivroFisicos e também Ebooks, uma forma de fazer isso
 * seria criando dois métodos adiciona, um para cada tipo de Livro (uma
 * sobrecarga):
 *
 * Esse código funcionaria sem nenhum problema, mas repare que está muito
 * repetido. 
 * 
 * Além disso, a cada novo tipo de Livro, precisaremos criar um novo
 * método adiciona que receba esse tipo como parâmetro, o que seria um tanto
 * trabalhoso e difícil de manter.
 *
 * Para evitar isso, podemos utilizar um recurso da linguagem bastante útil e
 * poderoso.
 *
 * Como existe uma herança envolvida, podemos dizer que tanto um LivroFisico
 * como um Ebook são filhos (extensões) da classe Livro.
 *
 * Poderíamos criar um único método adiciona, que recebe um Livro (superclasse)
 * como parâmetro:
 *
 */
public class CarrinhoDeCompras {

    
    
    //8 Forma - Sem Polimorfismo
    /*
    public void adiciona(LivroFisico livro) {
        System.out.println("Adicionando: " + livro);
    }

    public void adiciona(Ebook livro) {
        System.out.println("Adicionando: " + livro);
    }
     
    9 Forma - Com Polimorfismo
    
   
    Nosso código compilará e funcionará como esperado, pois podemos nos
    referenciar a esses objetos dessa formamais genérica, pela sua classe pai. 
    
    Esse interessante recurso é conhecido como Polimorfismo.
    Polimorfismo tem origem Grega, que significa VARIAS FORMAS.
    
    No grego poli=muitas e morphos=formas
    
    Veja o que acontece quando executamos nossa classe
    RegistroDeVendas adicionando os dois tipos de Livro no
    
    CarrinhoDeCompras, que agora possui um único método adiciona:
    
    Adicionando: LivroFisico@9e89d68
    Adicionando: Ebook@3b192d32
    
    */
    public void adiciona(Livro livro) {
    System.out.println("Adicionando: " + livro);
    }
}
