package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Atendente extends Usuario {
    public static List<Cliente>ListadeClientes = new ArrayList<Cliente>();
    public Atendente (String nome){

        super (nome);

    }

    @Override
    public void exibirMenu() {
        System.out.println("----Menu Atendente----");
        System.out.println("1 - Reserva");
     System.out.println("2 - Lista Reservas");

    }
      // Catrastrar cliente
      public static void cadastrarCliente(){

        System.out.println(" - CADASTRAR NOVO CLIENTE - ");
        System.out.print("Nome: ");
        Scanner scanner = new Scanner (System.in);
        String nome = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        Cliente cliente = new Cliente(nome);
        cliente.setNome(nome.get);
        Cliente.ListadeClientes.add(cliente);

      } 

    
    //Exclui cliente
    public static void excluirCliente(){
        Scanner scanner = new Scanner(System.in);
        String removido;
        System.out.println("Deletar um cliente do sistema.");
            if (ListadeClientes.isEmpty()){
                System.out.println("Não há clientes para ser removido.");
        }else{
            System.out.println("Qual o número do cliente que deseja remover: ");

                for (int i = 0; i <ListadeClientes.size(); i++){
                   System.out.println((i+1)+" - Nome"+ListadeClientes.get(i).getNome());
                   removido=ListadeClientes.get(i).getNome();
                }
             int clienteRemover = scanner.nextInt(); 
             if (clienteRemover >0 && clienteRemover <= ListadeClientes.size()){
                removido = ListadeClientes.get(clienteRemover - 1).getNome();
                ListadeClientes.remove(clienteRemover -1);
                System.out.println("Cliente "+removido+ "Removido da lista.");
             }else{
                System.out.println("Número inválido.");
             }

             }
        }


        //Atualizar Cliente
            public static void atualizarCliente(){
                Scanner scanner = new Scanner (System.in);
                Scanner scannerAt = new Scanner(System.in);

                int atualizado;
                String nomeAt;
                String cpfAt;

                System.out.println(" - Atualizar cliente da lista - ");
                    if (ListadeClientes.isEmpty()){
                        System.out.println("Não há cliente para ser atualizado.");

                    }else{
                        System.out.println("Escolha o número que deseja atualizar: ");
                        for (int i = 0; i<ListadeClientes.size(); i++){
                            System.out.println((i+1)+"Nome: " + ListadeClientes.get(i).getNome() + ListadeClientes.get(i).getCpf());

                        }
                    }
                    
                    int clienteAtualizar = scanner.nextInt() -1;
                    for (int i = 0; i < ListadeClientes.size(); i++){
                    System.out.println("Digite qual opção você deseja modificar:");

                    System.out.println("1 - Nome\n2 - CPF\n");
                    atualizado = scanner.nextInt();
                    if (atualizado == 1) {
                        System.out.print("Novo nome: ");
                        nomeAt = scannerAt.nextLine();
                        ListadeClientes.get(i).setNome(nomeAt);
                    }
                    if (atualizado == 2) {
                        System.out.print("Novo CPF: ");
                        cpfAt = scannerAt.nextLine();
                        ListadeClientes.get(i).setCpf(cpfAt);
                    }
                    }



            }
    }
    
    //

    public void cadastroCliente(List<Cliente>ListadeClientes, Scanner scanner){
        System.out.println("Nome cliente? ");
        String nomeCliente = scanner.nextLine();
        Cliente nwCliente = new Cliente(nomeCliente);
        ListadeClientes.add(nwCliente);
        System.out.println("Cadastrado com sucesso!");

        


    }

