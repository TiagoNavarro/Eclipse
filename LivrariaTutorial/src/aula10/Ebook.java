
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula10;

import aula10.*;

/**
 *
 * @author Tiago
 */

/*

Agora que temos uma forma forte de se representar um Ebook, podemos
criar ummétodo aplicaDescontoDe como descontomáximo de 15%. 

Assim,
evitamos aquele if que verificava se um Livro era impresso ou não.

Na classe Livro o método deve ficar assim:
Ver lá como ficou !! Na verdade ficou a mesma coisa !!!
*/

public class Ebook extends Livro {

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }
    
    // 1 Forma
    // Criar este metodo abaixo Pag 80
    //@Override bugou aqui era pra funcionar !!!
    
    @Override
    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        
        //ATENÇÃO, esta com este codigo comentado no PDF
        //mas como nao esta encapsulado esta com erros
        //dessa forma criei outro na linha 49
        
        //this.valor -= this.valor*porcentagem;
        //return true;
        
        //2 Forma, devido ao erro do codigo acima criei este
        
        /*
        Por mais que um Ebook seja um Livro, quando alguém chamar o
        método aplicaDescontoDe, o desconto será de 15%, e não de 30% com
        o está definido na classe pai.
        */
        
        double desconto = getValor() * porcentagem;
	setValor(getValor() - desconto);
	return true;
        
    }
    // Abrir livro e explicar o inicio da pagina 81 e desenhar no quadro o 
    // circulo com o metododo, Ebook e Livro.
    
    /* Explicar @Override de metodo
    
     Mas no lugar da classe Ebook herdar esse comportamento (que deve
     ser diferente para ela), podemos reescrevê-lo com o @Override em cima dele.
    
    Opcionalmente podemos marcar os métodos reescritos com a anotação
    @Overrride. Uma anotação é apenas uma marcação, como um
    post-it com uma observação importante sobre o local anotado. As annotations
    surgiram no Java 1.5, e têm um papel bastante importante na
    maior parte das bibliotecas mais atuais da linguagem. Por questões de
    compatibilidade, o uso do @Override é facultativo, mas é bastante interessante
    anotar os seus métodos dessa forma, já que, com isso, o compilador
    nos ajudará a validar que essemétodo é realmente uma reescrita.
    
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
    if (porcentagem > 0.15) {
    return false;
    }
    double desconto = getValor() * porcentagem;
	setValor(getValor() - desconto);
	return true;
    }
    
    Ao anotar nosso método com @Override, o código não compilará
    caso esse método não exista na classe pai (superclasse).
    
    Antes de testar essa mudança, precisamos fazeruma ultima alteração para
    que esse método compile.
    
    Como a visibilidade do atributo valor da classe Livro é private,
    a linha que o acessa diretamente do método aplicaDescontoDe da classe
    Ebook não vai funcionar. 
    
    Afinal, um atributo private só pode ser acessado
    pela própria classe, nemmesmo as classes filhas (subclasses) podem violar essa
    regra.
    
    Para que o código funcione, precisamos aumentar essa visibilidade, mas
    já conhecemos o problema de deixar os atributos public. 
    
    Uma alternativa
    é modificar a visibilidade dos atributos da classe Livro para protected,
    que é um meio termo entre public e private.
    
    A visibilidade protected deixará os atributos visíveis também para as
    classes filhas,mas normalmente evitamos utilizar essemodificador de visibilidade
    porque ele acaba tendo mais algumas exceções que afrouxam o nosso
    encapsulamento. 
    
    Conheceremos mais sobre o protected adiante, mas
    desde já vamos evitar essa alternativa.
    
    Dessa forma, não perderemos nem um pouco do encapsulamento da
    classe Livro! Quanto mais você estudar e se habituar com a orientação a
    objetos, mais você perceberá que garantir o encapsulamento das classes é
    fundamental. Ainda que um pouco, quando liberamos acesso dos atributos
    da superclasse para suas classes filhas, estamos violando o encapsulamento
    dessa classe.
    
    //ANTES PEÇA PARA OS ALUNOS FAZEREM COMPLEMENTAREM A REVENDA DE VEICULSO PARA QUE
    //SEJA POSSIVEL UTILIZAR HERANÇA, ENCAPSULAMENTO, SOBRECARGA DO CONSTRUTOR, SOBREESCRITA
    //DO MÉTODO, VISIBILIDADE PROTECTED, PRIVATE E PUBLIC E GETTERS E SETTERS.
    
    CONTINUAR NAS PROXIMAS LIÇOES A PARTIR DA PAGINA 84

    */

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    
    public String getWaterMark() {
        return waterMark;
    } 
}


