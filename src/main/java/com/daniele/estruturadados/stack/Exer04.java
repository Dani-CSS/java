package com.daniele.estruturadados.stack;

import java.util.Stack;

public class Exer04 {

    public static void main(String[] args) {

        Stack<Livro> pilha = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("A hora das estrela");
        livro1.setAutor("Clarisse lispectro");
        livro1.setAnoLancamento("1989");
        livro1.setIsbn("asdfkeiiagdfl");

        Livro livro2 = new Livro();
        livro1.setNome("O céu começa em você");
        livro1.setAutor("Robert Passin");
        livro1.setAnoLancamento("1995");
        livro1.setIsbn("wer6465tacv");

        Livro livro3 = new Livro();
        livro1.setNome("Quem me roubou de mim");
        livro1.setAutor("Fábio Melo");
        livro1.setAnoLancamento("2010");
        livro1.setIsbn("prnt31231srtty");

        System.out.println("Pilha de livros criada, pilha está vazia?  " + pilha.isEmpty());

        System.out.println("Empilhando livros na pilha: ");

        System.out.println("Espiando o topo da pilha " +  pilha.peek());

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);

        System.out.println(pilha.size() + "livros foram empilhados: ");
        System.out.println(pilha);

        System.out.println("Desempilhando livros da pilha: ");

        while (pilha.isEmpty()){
            System.out.println("Desempilhando livro: " +pilha.pop());
        }

        System.out.println("Todos os livros foram desempilhados!, pilha vazia: " + pilha.isEmpty());

    }
}
