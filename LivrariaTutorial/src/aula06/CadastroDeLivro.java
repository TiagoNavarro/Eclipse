/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;



/**
 *
 * @author Tiago
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

        Livro matematica = new Livro(alex);
        matematica.setNome("A matematica e o world");
        matematica.setDescricao("Podemos aprender muito");
        matematica.setIsbn("121212");
        matematica.setValor(82.1);
        System.out.println("Valor atual:" +matematica.getValor());
        
        // 1 Forma de fazer 
        // Este método agora mostra que o valor não pode
        // ser acima de 30%. Faça o teste, mude para 0.1 e depois
        // para 0.4
        // if (!matematica.aplicaDesconto(0.1)){
        // System.out.println("Desconto não pode ser maior que 30%");
        // }
        //Codigo modificado para o de cima
        //System.out.println("Valor com desconto:" +matematica.aplicaDesconto(0.1));
        
        // Sem modificação realizada acima, o desconto e a exibicação da mensagem 
        // está assim pelo metodo
        // da classe livro
        System.out.println("Valor com desconto:" +matematica.aplicaDesconto(0.4));
        matematica.setAutor(alex);

        matematica.mostrarDetalhesLivro();
        alex.mostrarDetalhesAutor();

        Livro historia = new Livro(tiago);
        historia.setNome("A historia de hoje");
        historia.setDescricao("Estamos perdidos");
        historia.setValor(50.10);
        historia.setIsbn("188484");

        historia.setAutor(tiago);
        
        historia.mostrarDetalhesLivro();
        tiago.mostrarDetalhesAutor();

    }

}
