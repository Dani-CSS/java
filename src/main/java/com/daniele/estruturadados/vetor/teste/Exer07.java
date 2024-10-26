package com.daniele.estruturadados.vetor.teste;

import com.daniele.exer.aula36.Contato;

import java.util.Scanner;
import java.util.ArrayList;

public class Exer07 extends Exer06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Contato> lista = new ArrayList<Contato>(20);

        criarContatosDinamicamente(5, lista);

        int opcao = 1;

        while (opcao != 0){
            opcao = obterOpcaoMenu(scan);
            switch (opcao){
                case 1:
                    adicionarContatoFinal(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scan, lista);
                    break;
                case 4:
                    obtemContato(scan, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7:
                    excluirPorPosicao(scan, lista);
                    break;
                case 8:
                    excluirContato(scan, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
            }
        }

    }

    private static void imprimirVetor(ArrayList<Contato> lista){
        System.out.println(lista);
    }

    private static void limparVetor(ArrayList<Contato> lista){
        lista.clear();
        System.out.println("Todos os contatos do vetor foram excluídos.");
    }

    private static void imprimeTamanhoVetor(ArrayList<Contato> lista){
        System.out.println("Tamanho do vetor é de " + lista.size());

    }

    private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida: ", scan);

        try{
            lista.remove(pos);
            System.out.println("Contato excluído!");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContato(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida: ", scan);

        try{
            Contato contato = (Contato) lista.get(pos);
            lista.remove(contato);
            System.out.println("Contato excluído!");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }


    private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

        try{
            Contato contato = (Contato) lista.get(pos);

            boolean existe = lista.contains(contato);

            if(existe){
                System.out.println("Contato existe. Seguem dados: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe.");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

        try{
            Contato contato = (Contato) lista.get(pos);
            System.out.println("Contato existe. Seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void obtemContato(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

        try{
            Contato contato = (Contato) lista.get(pos);
            System.out.println("Contato existe. Seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

        try{
            Contato contato = (Contato) lista.get(pos);
            System.out.println("Contato existe. Seguem dados: ");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista){

        System.out.println("Criando contato. Entre com as informações: ");
        String nome = leInformacao("Entre com o nome: ", scan);
        String telefone = leInformacao("Entre com o telefone: ", scan);
        String email = leInformacao("Entre com o email: ", scan);

        Contato contato = new Contato();

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista){

        System.out.println("Criando contato. Entre com as informações: ");
        String nome = leInformacao("Entre com o nome: ", scan);
        String telefone = leInformacao("Entre com o telefone: ", scan);
        String email = leInformacao("Entre com o email: ", scan);

        Contato contato = new Contato();

        int pos = leInformacaoInt("Entre com a posição a adicionar o contato: ", scan);

        try {
            lista.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição inválida. Contato não adicionado!");
        }
    }

    protected static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista){

        Contato contato;

        for(int i=1; i<=quantidade; i++){

            contato = new Contato();
            contato.setNome("Contato " + i );
            contato.setTelefone("111111111" + i);
            contato.setEmail("contato" +i+ "@email.com");

            lista.add(contato);
        }
    }

}



