
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula11;

/**
 *
 * @author Tiago
 */

    //ANTES PEÇA PARA OS ALUNOS FAZEREM COMPLEMENTAREM A REVENDA DE VEICULSO PARA QUE
    //SEJA POSSIVEL UTILIZAR HERANÇA, ENCAPSULAMENTO, SOBRECARGA DO CONSTRUTOR, SOBREESCRITA
    //DO MÉTODO, VISIBILIDADE PROTECTED, PRIVATE E PUBLIC E GETTERS E SETTERS.
    
    //CONTINUAR NAS PROXIMAS LIÇOES A PARTIR DA PAGINA 84


public class Ebook extends Livro {

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }
    
    
    //@Override bugou aqui era pra funcionar !!!
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        
        /*
        1 Forma
        
        No método aplicaDesconto da classe Ebook, chamamos o
        getter e setter do atributo valor utilizando a palavra reservada
        this. Uma outra forma de fazer isso seria utilizando o super. Assim,
        estamos deixando claro que o método invocado é da classe pai. Existem
        situações em que é muito interessante utilizar super, como neste caso:
        */
        return super.aplicaDesconto(porcentagem);
        
        /*
        2 Forma
        O codigo acima acessa a regra de negócio do método da classe Livro, assim
        nao é necessario usar esta linha abaixo.
        
        double desconto = getValor() * porcentagem;
	setValor(getValor() - desconto);
	return true;
        */
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    
    public String getWaterMark() {
        return waterMark;
    } 
}


