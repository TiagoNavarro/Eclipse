/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula16;

/**
 *
 * @author Tiago
 */

/*1 Forma
Em Java, há uma outra forma para se tirar proveito de todos os benefícios do
polimorfismo sem ter que acoplar tanto as suas classes com vários níveis de
herança. 

Você pode estabelecer um fator em comum entre as classes, criando
uma espécie de contrato.

Para esse contrato, não importa a forma como será implementado, a única
coisa que importa é que seus métodos (cláusulas) sejam implementados de
alguma forma. 

Isso lembra algo? Sim, é bastante parecido com um método
abstrato cujo corpo você só define na superclasse para que todas as subclasses
herdem a obrigação de implementá-lo.

Esse tipo de contrato Java é conhecido como Interface.

Podemos criar uma interface Produto, que por enquanto terá um
único método abstrato estabelecendo que todo produto deve ter o método
getValor. 

Uma interface se parece bastante com uma classe abstrata que
tenha apenasmétodos abstratos,mas no lugar de declará-la como uma classe,
utilizamos a palavra reservada interface:

Como todo método sem corpo de uma interface é abstrato, o uso do modificador
abstract é opcional. Não precisamos também adicionar o modificador
public, pois seus métodos também são públicos por padrão. Podemos
simplificar a escrita da interface Produto deixando apenas:

*/
public interface Produto {
    //public abstract double getValor();
    //ou
    // Vou deixar assim pq ta assim no livro
    double getValor();
}

/*
Uma interface não pode ter atributos e, até a versão 1.7 da linguagem, também
não pode ter nenhum método concreto, ou seja, com implementação.
Veremos que, a partir do Java 1.8, isso mudou um pouco.

Podemos agora fazer com que todas as classes que idealizam produtos de
nossa livraria assinem o contrato Produto. 

Para fazer isso, basta adicionar
a palavra-chave implements seguida do nome da interface que deve ser
implementada na declaração das classes, veja:

Altere nas classes Livro e Revista.
*/
