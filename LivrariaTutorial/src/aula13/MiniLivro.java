/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author Tiago
 */
//3 Forma
//Criar classe MiniLivro

/*
O que acontecerá quando modificarmos o código da classe
RegrasDeDesconto criando um MiniLivro onde anteriormente
criávamos um Livro? Vamos fazer essa alteração LA e executá-la para ver o
resultado. 
*/
public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }
}
