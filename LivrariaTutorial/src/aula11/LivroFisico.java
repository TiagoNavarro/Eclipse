/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Tiago
 *
 * 5 Forma 
 * 
 * Criar a classe LivroFisico conforme abaixo
 * a explicação completa esta na classe de livro
 *
 * Uma reação bem comum de quem está aprendendo orientação a objetos
    é perguntar: então eu devo criar uma nova classe pra cada tipo de
    livro?. 
    * 
    A resposta é sim. E você logo perceberá que isso não é um problema.
    É muito mais interessante trabalhar com classes menores, que representam
    bem os seus tipos e possuem suas regras específicas bem encapsuladas,
    do que trabalhar comuma única classe carregando toda essa
    responsabilidade.
    
    Poderíamos sim ter uma única classe Livro que tivesse todos os
    comportamentos de um LivroFisico, um Ebook e dos demais tipos
    que podem aparecer. Mas imagine o tamanho dessa classe, a quantidade
    demétodos e ifs encadeados para lidar comas diferentes regras de cada
    tipo de Livro. 
    
    A classe seria enorme e bem difícil de manter.
    Lembre-se sempre que Java é uma linguagem fortemente tipada, você
    pode e deve criar objetos para representar cada tipo de elemento da sua
    aplicação.
    
    Essa explicação foi até a metade da pagina 87
    
 * 
 */
public class LivroFisico extends Livro {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }
}
