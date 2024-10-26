package com.daniele.estruturadados.vetor.teste;

import com.daniele.estruturadados.vetor.VetorObjetos;

public class Aula10 {

    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);

        vetor.adicionar(3);
        vetor.adicionar(4);
        vetor.adicionar(5);

        System.out.println("Tamanho = " + vetor.tamanho());

        System.out.println(vetor);
    }
}
