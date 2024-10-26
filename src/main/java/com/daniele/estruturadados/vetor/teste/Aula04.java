package com.daniele.estruturadados.vetor.teste;

import com.daniele.estruturadados.vetor.Vetor;

public class Aula04 {

    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("1");
        vetor.adicionar("2");
        vetor.adicionar("3");

        System.out.println(vetor.tamanho());

        System.out.println(vetor);
    }
}
