package edu.thiagofr.desafio_dio_banco;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente thiago = new Cliente();
        thiago.setNome("Thiago Favacho");
        Conta cc = new ContaCorrente(thiago);
        cc.depositar(100);

        Cliente flavia = new Cliente();
        flavia.setNome("Flavia Favacho");
        Conta cp = new ContaPoupanca(flavia);
        cp.depositar(150);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Banco banco = new Banco("Banco Itaú", List.of(cc, cp));
        banco.imprimirClientes();

    }
}
