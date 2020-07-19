/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;
import aula08.*;

/**
 *
 * @author Tiago
 */
// Continuando a partir do final da pagina 56 até a 69 do livro (tudo ja feito
// anteriormente)
// Para agora criar uma classe espefífica para RegrasDeDesconto
// Continuando na pagina 70 sobre sobrecargade construtor

public class RegrasDeDesconto {

    public static void main(String[] args) {

        Autor joaquim = new Autor();
        
        Livro fisica = new Livro(joaquim);
        fisica.setValor(59.90);
        fisica.setNome("O livro de fisica");

        //Campo encapsulado
        System.out.println("O valor atual: " + fisica.getValor());
        //Campo não esta encapsulado
        //System.out.println("O valor atual: " + fisica.valor());
        
        //2 Forma de fazer
        //dessa forma nao ira funcionar pois os campos ja estao
        //encapsulados, veja a mensagem de erro que legal
        //diz que classe livro é privada
        //E isso é otimo pois SOMENTE pelo método sera possivel
        //realizar o calculdo. Ver final Pagina 58
        /*
        fisica.valor -= livro.valor * 0.4;
        System.out.println("Valor com desconto:" + fisica.valor());
        */
        
        //1 Forma de fazer
        // Se mudar para 0.4 deverá exibir mensagem que não pode ter desconto
        
        /*
        if (!fisica.aplicaDesconto(0.1)) {
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto:" + fisica.getValor());
        }
        */
    }
}
