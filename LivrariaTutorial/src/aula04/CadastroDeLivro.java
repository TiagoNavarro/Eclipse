/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

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
        //1 Adicionado para mostrar valor com o GET
        System.out.println("Valor atual:" +matematica.getValor());
        // 1.1 O método System acima não encapsulado seria:
        //System.out.println("Valor atual:" +livro.valor);
        
        //2 Mostrar valor com desconto após método acima
        System.out.println("Valor com desconto:" +matematica.getValor()*0.1);
        //2.2 Mostrar calculo do desconto sem encapsulamento seria:
        //livro.valor -= livro.valor * 0.1;
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
