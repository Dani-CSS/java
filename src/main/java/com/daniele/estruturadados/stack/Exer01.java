package com.daniele.estruturadados.stack;

import java.util.Scanner;
import java.util.Stack;

public class Exer01<T> extends Pilha<T> {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>(10);

        Scanner scan = new Scanner(System.in);

        for(int i=1; i<=10; i++){
            System.out.println("Entre com o número: ");
            int num = scan.nextInt();

            if (num % 2 == 0){
                System.out.println("Empilhando o número "+ num);
                pilha.empilha(num);
            } else {
                Integer desempilhado = pilha.desempilha();

                if(desempilhado == null){
                    System.out.println("Pilha está vazia");
                } else{
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: ");
                    pilha.desempilha();
                }
            }
        }

        System.out.println("Todos os números foram lidos, desempilhando números da pilha:  ");

        while (!pilha.estaVazia()){
            Integer desempilhado = pilha.desempilha();

            System.out.println("Desempilha um elemento da pilha: "
                    + pilha.desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados");
    }

}
