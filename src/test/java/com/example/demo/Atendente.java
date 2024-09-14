package com.example.demo;

import java.util.List;
import java.util.Scanner;

public class Atendente extends Usuario {
    public Atendente (String nome){

        super (nome);



    }

    @Override
    public void exibirMenu() {
        System.out.println("----Menu Atendente----");
        System.out.println("1 - Reserva");
     System.out.println("2 - Lista Reservas");

    }
        
    

    public void cadastroCliente(List<Cliente>clientes, Scanner scanner){
        System.out.println("Nome cliente? ");
        String nomeCliente = scanner.nextLine();
        Cliente nwCliente = new Cliente(nomeCliente);
        clientes.add(nwCliente);
        System.out.println("Cadastrado com sucesso!");

        


    }

}