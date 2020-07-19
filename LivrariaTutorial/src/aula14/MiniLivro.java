/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;
//3 Forma

public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }
    //Adicionado o metodo abaixo om Override
    /*
    A partir de agora, todo filho de Livro logo quando criado
    já precisará definir qual a sua regra de desconto, caso contrário o código não
    compila.
    
    Toda classe filha (subclasse) precisa implementar os métodos abstratos
    da classe pai (superclasse). A não ser que ela também seja abstrata.
    */
    @Override
    public boolean aplicaDesconto(double porcentagem) {
        return false;
    }
}
