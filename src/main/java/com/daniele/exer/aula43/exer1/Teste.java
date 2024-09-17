package com.daniele.exer.aula43.exer1;

public class Teste {

    public static void main(String[] args) {

       System.out.println("*** Teste Conta Bancária ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Daniele");
        contaSimples.setNumConta("1565465");
        contaSimples.setSaldo(0);

        contaSimples.depositar(100);
        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("*** Teste Conta Poupança ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Daniele");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setDiaRendimento(16);

        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);
        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Novo rendimento aplicado. Novo saldo é de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento. Novo saldo não calculado!");
        }
        System.out.println(contaPoupanca);


        System.out.println("*** Teste Conta Especial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Daniele");
        contaEspecial.setNumConta("22222");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso! Novo saldo: " + conta.getSaldo());
        }  else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }
}
