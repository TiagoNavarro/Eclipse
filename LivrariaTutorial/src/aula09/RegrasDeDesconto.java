/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;
import aula09.*;

/**
 *
 * @author Tiago
 */

public class RegrasDeDesconto {

    public static void main(String[] args) {

        Autor joaquim = new Autor();
        
        Livro fisica = new Livro(joaquim);
        fisica.setValor(59.90);
        fisica.setNome("O livro de fisica");

        //Campo encapsulado
        System.out.println("O valor atual: " + fisica.getValor());
    }
}
