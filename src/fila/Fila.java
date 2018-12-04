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
public class Fila<T> {
    
    private T[] fila;
    private int inicio;
    private int fim;
    
    public Fila(int tam) {
        this.fila = (T[]) new Object[tam];
        this.inicio = 0;
        this.fim = 0;
    }
    
    public void insere(T valor) {
        if(fim == fila.length)
            fim = 0;
        if (!estaCheia()) {
            this.fila[fim++] = valor;
        } else {
            System.out.println("FILA CHEIA");
        }
    }

    public T remove() {
        T t = fila[inicio++];
        return t;
    }

    public boolean estaVazia() {
        return inicio == fim;
    }
    
    public boolean estaCheia() {
        if(((fim == fila.length - 1) && (inicio == 0)) || (fim == inicio - 1))
            return true;
        return false;
    }
    
    public void imprimeFila(){
        int i = inicio;
        while(i < fim){
            System.out.println(fila[i]);
            i++;
        }
    }
    
}
