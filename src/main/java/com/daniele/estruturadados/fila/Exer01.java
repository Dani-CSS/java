package com.daniele.estruturadados.fila;

public class Exer01 {

    public static void main(String[] args) {

        Fila<Documento> filaImpressora = new Fila<>();

        filaImpressora.enfileirar(new Documento("1", 2));

        while (!filaImpressora.estaVazia()){
            Documento doc = filaImpressora.desenfileirar();
            System.out.println("Imprimindo documento " + doc.getNome());
            try{
                Thread.sleep(200 * doc.getNumFolhas());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Todos os documentos foram impressos!");
    }
}
