package com.daniele.estruturadados.fila;

public class Aula24 {

    public static void main(String[] args) {

        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileirar();
        fila.enfileirar();
        fila.enfileirar();

        System.out.println(fila);


    }
}
