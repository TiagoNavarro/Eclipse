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
public class Autor {

    String nome;
    String email;
    int cpf;

    void mostrarDetalhesAutor() {

        System.out.println("Mostrando o autor ");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("--");
    }

}
