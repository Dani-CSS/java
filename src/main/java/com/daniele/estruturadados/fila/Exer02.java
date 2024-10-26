package com.daniele.estruturadados.fila;

public class Exer02 {

    public static void main(String[] args) {

        Fila<Pessoa> regular = new Fila<>();
        Fila<Pessoa> prioridade = new Fila<>();

        final int MAX_PRIORIDADE = 3;

        regular.enfileirar(new Pessoa("1", 1));
        regular.enfileirar(new Pessoa("2", 2));
        regular.enfileirar(new Pessoa("3", 7));
        prioridade.enfileirar(new Pessoa("6", 3));

        while (!prioridade.estaVazia()) {
            int cont = 0;

            while (!prioridade.estaVazia() && cont < MAX_PRIORIDADE) {
                atendePessoa(prioridade);
                cont++;
            }

            if (!regular.estaVazia()) {
                atendePessoa(regular);
            }

            if (prioridade.estaVazia()) {
                while (!regular.estaVazia()) {
                    atendePessoa(regular);
                }
            }
        }
    }

    public static void atendePessoa(Fila<Pessoa> fila) {
        Pessoa pessoaAtendida = fila.desenfileirar();
        System.out.println(pessoaAtendida + " foi atendida!");
    }
}
