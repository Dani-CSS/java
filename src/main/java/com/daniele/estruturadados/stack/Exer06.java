package com.daniele.estruturadados.stack;

import java.time.chrono.MinguoDate;

public class Exer06 {

    public static void main(String[] args) {

        imprimeResultado("A + B");
        imprimeResultado("A + B + (C-D)");
        imprimeResultado("{[()]}[](){()}");
        imprimeResultado("{][[)]}[](){()}");
        imprimeResultado("A + B + C-D)");
    }

    public static void imprimeResultado(String expressao){
        System.out.println(expressao + "está balanceado?" +
                verificadaSimbolosBalanceados(expressao));
    }

    final static String ABRE = "({[";
    final static String FECHA = "]})";

    public static boolean verificadaSimbolosBalanceados(String expressao){

        boolean balanceado = true;
        Pilha<Character> pilha =  new Pilha<>();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length() && balanceado ){
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1){
                pilha.empilha(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1){

                if (pilha.estaVazia()){
                    return false;
                } else {
                    topo = pilha.desempilha();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }
            index++;
        }
        return true;
    }
}
