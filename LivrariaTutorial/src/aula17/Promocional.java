/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17;

/**
 *
 * @author Tiago
 */

/*
1 Forma

Ouso da interface já nos ajudou a resolver o problema de polimorfismo de nossos
produtos. Agora há uma forma simples e flexível para representar qualquer
Produto de nossa livraria. Mas ainda precisamos resolver o problema
do método aplicaDesconto.

Ao adicionar esse método abstrato na classe Livro, obrigamos todas as
suas subclasses a implementá-lo, mas não é bem isso que precisamos. Essa
solução deixa de ser interessante quando nem todos os Livros tenham esse
comportamento, como é o caso do MiniLivro, que não pode ter um desconto.

Outra questão é que apenas os filhos da classe Livros têm essa
obrigação, sendo que uma Revista também deve possuir o método
aplicaDescontoDe. 

Podemos diminuir esse acoplamento de uma
forma bem simples, criando uma nova interface! Vamos chamá-la de
Promocional:

*/
public class Promocional {
    
    //boolean aplicaDesconto(double porcentagem);
    //boolean aplicaDesconto(double porcentagem);
    /*
    PAREI NA PAGINA 112, ACREDITO QUE AS TÉCNICAS DE ORIENTAÇÃO A 
    OBJETOS FORAM BEM EXPLICADAS ATE AQUI, MAS DA PARA CONTINUAR.
    */
}
