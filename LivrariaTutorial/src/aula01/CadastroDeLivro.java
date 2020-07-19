/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import aula01.Livro;
import aula01.Autor;

/**
 *
 * @author Tiago
 */
public class CadastroDeLivro {

    public static void main(String[] args) {

        Autor tiago = new Autor();
        tiago.nome = "Tiago Adelino Navarro";
        tiago.email = "tiago@gmail.com";
        tiago.cpf = 12345;

        Autor alex = new Autor();
        alex.nome = "Alex";
        alex.email = "alex@gmail.com";
        alex.cpf = 56566;

        Livro matematica = new Livro(alex);
        matematica.nome = "A matematica e o mundo";
        matematica.descricao = "Podemos aprender muito";
        matematica.valor = 80.10;
        matematica.isbn = "121212";

        matematica.autor = alex;

        matematica.mostrarDetalhes();

        Livro historia = new Livro(tiago);
        historia.nome = "A historia de hoje";
        historia.descricao = "Estamos perdidos";
        historia.valor = 50.10;
        historia.isbn = "188484";

        historia.autor = tiago;

        historia.mostrarDetalhes();

    }

}
