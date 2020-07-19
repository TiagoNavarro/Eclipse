/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;



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
        // 2 Alteração
        //tem que comenta-lo para que o construtor coloque o valor nele.
        //ao comenta-lo, o metodo mostrarDetalhes se encarrega disso.
        //matematica.setIsbn(null);
        matematica.setValor(82.1);
        System.out.println("Valor atual:" +matematica.getValor());
        
        // Uma Forma de fazer 
        // Este método agora mostra que o valor não pode
        // ser acima de 30%. Faça o teste, mude para 0.1 e depois
        // para 0.4
        
        //Vou deixar assim pois é o recomendado pelo livro
        if (!matematica.aplicaDesconto(0.1)){
        System.out.println("Desconto não pode ser maior que 30%");
        }
       
        matematica.setAutor(alex);

        matematica.mostrarDetalhesLivro();
        alex.mostrarDetalhesAutor();

        Livro historia = new Livro(tiago);
        historia.setNome("A historia de hoje");
        historia.setDescricao("Estamos perdidos");
        historia.setValor(50.10);
        //historia.setIsbn("188484");

        historia.setAutor(tiago);
        
        historia.mostrarDetalhesLivro();
        tiago.mostrarDetalhesAutor();

    }

}
