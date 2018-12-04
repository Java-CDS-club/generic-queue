/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author afonso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fila f = new Fila<Integer>(5);
        
        f.insere(23);
        f.insere(64);
        f.insere(21);
        f.insere(70);
        f.insere(91);
        
        f.remove();
        
        f.insere(2433);
        
        f.remove();
        
        f.imprimeFila();
    }
    
}
