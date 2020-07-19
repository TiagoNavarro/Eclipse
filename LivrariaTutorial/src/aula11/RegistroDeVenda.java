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
 * 6 Forma
 *
 * Criar classe de venda conforme pagina 87
 * 
 * Repare que criamos um LivroFisico e um Ebook com o mesmo
    Autor. 
    
    Nosso próximo passo será adicionar esses dois elementos em um
    CarrinhoDeCompras. 
    
    O código deve ficar parecido com este:
    
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    carrinho.adiciona(fisico);
    carrinho.adiciona(ebook);
 * 
 */
public class RegistroDeVenda {

    public static void main(String[] args) {
        
        Autor mauricio = new Autor();
        mauricio.setNome("Mauricio Aniche");
        
        LivroFisico fisico = new LivroFisico(mauricio);
        fisico.setNome("Test-Driven Development");
        
        Ebook ebook = new Ebook(mauricio);
        ebook.setNome("Test-Driven Development");
    }
}
