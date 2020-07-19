/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;


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
        //2 Mostra o valor com o GET
        System.out.println("Valor atual:" +matematica.getValor());
        //3 Chama o método aplicaDesconto da classe Livro
        System.out.println("Valor com desconto:" +matematica.aplicaDesconto(0.1));
        //Esses códigos abaixo não precisa mais, agora foi criado um
        //metodo de desconto na classe Livro para substitui-los.
        //System.out.println("Valor atual:" +matematica.getValor());
        //System.out.println("Valor com desconto:" +matematica.getValor()*0.1);
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
