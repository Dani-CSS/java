package com.daniele.estruturadados.vetor.teste;

import com.daniele.estruturadados.vetor.Vetor;

public class Aula08 {

    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(3);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("E");
        vetor.adicionar("F");
        vetor.adicionar("G");

        System.out.println(vetor);
    }
}
