/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16;

import aula15.*;

public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }
    @Override
    public boolean aplicaDesconto(double porcentagem) {
        return false;
    }
}
