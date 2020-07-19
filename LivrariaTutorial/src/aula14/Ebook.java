
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula14;



public class Ebook extends Livro {

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }
    
   
    @Override
    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        //4 Forma
        //Codigo comentado pois depois da abstração para de funcionar
        //return super.aplicaDesconto(porcentagem);
        
        //Colocar esse no lugar do de cima
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        return true;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    
    public String getWaterMark() {
        return waterMark;
    } 
}


