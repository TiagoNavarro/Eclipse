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
public class Autor {

    private String nome;
    private String email;
    private int cpf;

    void mostrarDetalhesAutor() {

        System.out.println("Mostrando o autor ");
        System.out.println("Nome: " + getNome());
        System.out.println("E-mail: " + getEmail());
        System.out.println("CPF: " + getCpf());
        System.out.println("--");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

}
