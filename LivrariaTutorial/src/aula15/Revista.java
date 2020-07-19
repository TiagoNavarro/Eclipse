/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15;

/**
 *
 * @author Tiago
 */
//1 Forma - Novo conceito de Interface
/*
    Além dos mais diversos tipos de Livros, nossa livraria também trabalhará
    com Revistas e futuramente outros produtos. Podemos criar uma nova
    classe para representá-la, como a seguir:
 */
public class Revista {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora; //va la e crie Editora também

    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem > 0.1) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
