package com.daniele.estruturadados.fila;

public class Exer03 {

    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {

        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();

        fila.enfileirar(new Pessoa("3", VERMELHO));


        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNovosPacientes pacientes = new PSNovosPacientes(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);

        t1.start();
        t2.start();

    }
}
