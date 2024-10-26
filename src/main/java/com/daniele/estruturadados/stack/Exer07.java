package com.daniele.estruturadados.stack;

import java.util.Stack;

public class Exer07 {

    public static void main(String[] args) {

        imprimeResultado(10);

        imprimeResultado(25);

        imprimeResultado(100);

        imprimeResultado(10035);
    }

    public static void imprimeResultado(int numero){
        System.out.println(numero + " em binário é: " + decimalbinario(numero));
    }

    public static String decimalbinario(int numero){
        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;

        while (numero > 0){
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while (!pilha.isEmpty()){
            numBinario += pilha.pop();
        }
        return numBinario;
    }
}
