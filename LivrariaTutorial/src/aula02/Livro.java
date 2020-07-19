/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Tiago
 */
public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;
    
    public Livro(Autor autor) {
        this.autor = autor;
    }

    void mostrarDetalhesLivro() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
    }
}

/*
Atividade Vendedora de carros.

Depois de fazer atividades com os , passar essa:

Uma concessionária precisa de um software que controle a venda de veículos. 
Nesse sistema deverá constar as classes clientes, carros e a CadastrodeCarros. 
Entretanto existem algumas restrições, os carros só podem ser associados aos 
clientes se eles já existirem. Não podem existir carros sem clientes vinculados.  
Crie 5 carros e 5 clientes, com ambos os objetos com 5 atributos cada. 
Depois exiba as informações de ambos. O método para mostrar as informações devem estar na classe Carro. 

*/
