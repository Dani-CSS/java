package com.daniele.exer.aula34;

public class Exer01 {

    static void imprimirValor(){
        System.out.println("Contador: " + Contador.obterValor());
    }

    public static void main(String[] args) {
        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador.zerar();
        imprimirValor();
        Contador.obterValor();
    }
}
