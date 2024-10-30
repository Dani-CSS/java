package com.daniele.linkedLists;

public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        // testesIniciais();
        // adicionaInicio();
        // adicionaPosicao();
        // removeInicio();
        // removeFinal();
        removePosicao();
    }

    public static void removePosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);
        System.out.println("Elemento removido " + lista.remove(3));
        System.out.println("Lista: " + lista);
    }

    public static void removeFinal(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println(lista);
        lista.removeFinal();
        System.out.println(lista);
    }

    public static void adicionaPosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(2,3);
        lista.adiciona(0,0);

        System.out.println(lista);

        //lista.adiciona(5, 0);
    }

    public static void removeInicio(){
       ListaEncadeada<Integer> lista = new ListaEncadeada<>();

       lista.adiciona(1);
       lista.adiciona(2);
       lista.adiciona(3);

        System.out.println(lista);
        lista.removeInicio();
        System.out.println(lista);
    }

    public static void adicionaInicio(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);

        System.out.println(lista);
    }

    public static void testesIniciais(){
            ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
            lista.adiciona(1);

            System.out.println("Tamanho: " + lista.getTamanho());
            System.out.println(lista);

            lista.adiciona(2);
            System.out.println(lista);

            lista.adiciona(3);
            System.out.println(lista);

            System.out.println("*****busca por elemento*****");
            System.out.println(lista.busca(0));
            System.out.println(lista.busca(1));
            System.out.println(lista.busca(2));
            System.out.println(lista.busca(3));

            System.out.println("*****busca por posição*****");
            System.out.println(lista.buscaPorPosicao(0));
            System.out.println(lista.buscaPorPosicao(1));
            System.out.println(lista.buscaPorPosicao(2));
            // System.out.println(lista.buscaPorPosicao(-1));
            // System.out.println(lista.buscaPorPosicao(4));
    }
}
