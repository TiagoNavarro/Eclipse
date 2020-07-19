/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;
//Pag 101

public class LivroFisico extends Livro {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }
    //6 Forma
    //Adicionado esse metodo
    /*
    Com este metodo nossa classe MiniLivro não precisarámais sobrescrever ométodo
    */
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("aplicando desconto no LivroFisico");
        return true;
    }
}
