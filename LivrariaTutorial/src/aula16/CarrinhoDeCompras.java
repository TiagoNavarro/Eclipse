/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16;

//4Forma

/*
    Como todos que implementam uma interface podem ser referenciados
    por este tipo, podemos usar polimorfismo com interfaces. Por exemplo,
    nométodo adiciona do CarrinhoDeCompras podemos receber um
    Produto como parâmetro:
*/

public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDesconto(0.05);
        total += livro.getValor();
    }
  
    public void adiciona(Revista revista) {
        System.out.println("Adicionando: " + revista);
        revista.aplicaDesconto(0.05);
        total += revista.getValor();
    }
    
    //5 Forma
    /*
    Opolimorfismo funcionará,mas o problema desse código é que nem todo
    Produto tem ométodo aplicaDescontoDe,mas apenas os filhos da classe
    Livro. Sim, poderíamos mover o método abstrato aplicaDescontoDe
    para a interface Produto, mas se nem todos os produtos têm um desconto,
    devemos evitar isso. Por enquanto, removeremos esse desconto, mas logo
    veremos uma formamais interessante de resolver o problema. Nosso método
    public void adiciona(Produto produto) deve ser criado assim:
    */
    
    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }
}
