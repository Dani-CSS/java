package com.daniele.estruturadados.fila;

public class Exer21 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(1);
        fila.enfileirar(2);

        System.out.println(fila.espiar());

        System.out.println(fila.toString());
    }
}
