package org.example;

import org.example.Interfaces.CadastrarClienteInterface;

public class Main {
    public static void main(String[] args) {

        CadastrarClienteInterface clienteComum = new ClienteComumService();

        clienteComum.cadastrarCliente("Gustavo", "gustavo@email.com");
        System.out.println(clienteComum.buscarClientePorEmail("gustavo@email.com"));

        System.out.println("\n-----------------------------\n");


        ClienteVIPService clienteVIP = new ClienteVIPService();

        clienteVIP.cadastrarCliente("Amanda", "amanda@email.com");
        System.out.println(clienteVIP.buscarClientePorEmail("amanda@email.com"));

        clienteVIP.enviarNotificacao("amanda@email.com",
                "Bem-vinda à área VIP!");

        clienteVIP.aplicarDescontoVIP("amanda@email.com",
                15.0);

    }
}