/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16;

import aula15.*;

/**
 *
 * @author Tiago
 */
//3 Forma
//mudando public class Revista { para 

public class Revista implements Produto{

    /*
    Como todas essas classes já possuem o método getValor declarado,
    você não perceberá nenhuma diferença. 
    
    Nosso código passa a funcionar
    como esperado. Mas é importante perceber que se apagarmos o método
    getValor a classe deixará de compilar, afinal toda classe que implementa
    a interface Produto é obrigada a implementar seus métodos abstratos.
    
    Mostrar diagrama da pagina 110
    
    Depois va para a classe CarrinhoDeCompras
    */
    
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora; 

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
