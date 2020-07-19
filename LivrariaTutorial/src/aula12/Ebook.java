
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula12;

/**
 *
 * @author Tiago
 * 
 * Pagina 90
 * não modifiquei como no pdf, deixei para ver se realmente
 * precisa para depois
 * 
 */

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
        
        return super.aplicaDesconto(porcentagem);
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    
    public String getWaterMark() {
        return waterMark;
    } 
}


