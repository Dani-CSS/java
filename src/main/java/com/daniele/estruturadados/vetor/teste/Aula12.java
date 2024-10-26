package com.daniele.estruturadados.vetor.teste;

import com.daniele.estruturadados.vetor.Lista;

import java.util.List;

public class Aula12 {

    public static void main(String[] args) {

        List<String> lista = (List<String>) new Lista<String>();

        lista.add("A");
        lista.add("C");

        System.out.println(lista);

        lista.add(1,"B");

        System.out.println(lista);

    }
}
