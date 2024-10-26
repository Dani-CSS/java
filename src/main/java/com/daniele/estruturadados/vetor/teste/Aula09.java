package com.daniele.estruturadados.vetor.teste;

import com.daniele.estruturadados.vetor.Vetor;

public class Aula09 {

    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        System.out.println("Remover o elemento M");

        int pos = vetor.busca("M");
        if (pos  > -1){
            vetor.remove(pos);
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);
    }
}
