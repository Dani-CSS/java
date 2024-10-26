package com.daniele.exer.aula74;

public enum CorSemaforo {

    VERDE(1000), AMARELO(300), VERMELHO(200);

    private int tempoEspera;

    CorSemaforo(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
