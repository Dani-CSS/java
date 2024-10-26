package com.daniele.estruturadados.stack;

public class Exer03 {


    public static void main(String[] args) {

        Pilha<Livro> pilha = new Pilha<>(20);

        Livro livro1 = new Livro();
        livro1.setNome("A hora das estrerla");
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

        System.out.println("Pilha de livros criada, pilha está vazia?  " + pilha.estaVazia());

        System.out.println("Empilhando livros na pilha: ");

        System.out.println("Espiando o topo da pilha " +  pilha.topo());

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);

        System.out.println(pilha.tamanho() + "livros foram empilhados: ");
        System.out.println(pilha);

        System.out.println("Desempilhando livros da pilha: ");

        while (pilha.estaVazia()){
            System.out.println("Desempilhando livro: " +pilha.desempilha());
        }

        System.out.println("Todos os livros foram desempilhados!, pilha vazia: " + pilha.estaVazia());

  }


}
