package edu.thiagofr.desafio_dio_banco;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }
    
    public void imprimirClientes() {
        System.out.println("Lista de Clientes do Banco " + nome + ":");
        for (Conta conta : contas) {
            System.out.println(conta.getCliente().getNome());
        }
    }
    
}