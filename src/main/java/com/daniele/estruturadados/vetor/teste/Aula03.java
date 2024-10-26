package com.daniele.estruturadados.vetor.teste;

import com.daniele.estruturadados.vetor.Vetor;

public class Aula03 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        try {
            vetor.adicionar("1");
            vetor.adicionar("2");
            vetor.adicionar("3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
