package com.daniele.estruturadados.stack;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número: ");

        for(int i=1; i<=10; i++){
            int num = scan.nextInt();
            if(num == 0){
                Integer desempilhado = par.desempilha();
                if(desempilhado == null){
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado);
                }

                desempilhado = impar.desempilha();
                if(desempilhado == null){
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado);
                }

            } else if(num % 2 == 0){
                System.out.println("Número par, empilhando na pilha par: " + num);
                par.empilha(num);
            } else {
                System.out.println("Número impar, empilhando na pilha impar: " + num);
                impar.empilha(num);
            }
        }

        System.out.println("Desempilhando todos os números da lista par");

        while (!par.estaVazia()){
            System.out.println("Desempilhando da pilha par: " + par.desempilha());
        }

        System.out.println("Desempilhando todos os números da lista impar");

        while (!par.estaVazia()){
            System.out.println("Desempilhando da pilha par: " + impar.desempilha());
        }


    }
}
