package com.daniele.estruturadados.stack;

import com.daniele.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

   private T[] elementos;
   private int tamanho;

    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        elementos =  (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public void aumentaCapacidade(T elementos){

    }

    public boolean estaVazia(){
        return super.estaVazia();
    }

    public T topo(){
        if (this.estaVazia()){
            return null;
        }
        return this.elementos[tamanho-1];
    }

    public T desempilha(){
        if(this.estaVazia()){
            return null;
        }
        T elemento = this.elementos[tamanho-1];
        tamanho--;
        return elemento;
    }





}
