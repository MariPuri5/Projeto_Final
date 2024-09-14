package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelSistema {

        private static List<Usuario> usuarios = new ArrayList<usa>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //Criação de usuario teste.

            Atendente atendente = new Atendente("João");
            Cliente cliente = new Cliente("Isabela");

            usuarios.add(atendente);
            usuarios.add(cliente);

            Reserva reserva = new Reserva("1", "Aberta");
            Reserva reserva1 = new Reserva("2", "Concluída");

            cliente.getReservas().add(reserva);
            cliente.getReservas().add(reserva1);

            while (true){
                System.out.println("Informe qual usuario deseja? \n 1- Atendente \n 2- Cliente \n 0- Sair" );
                int opcao = scanner.nextInt();
                scanner.nextLine();

                    if (opcao == 0){
                        break;


                    }

                    Usuario usuario = null;

                        if (opcao == 1) {
                          usuario = atendente;  
                        
                        }else if (opcao == 2){
                            usuario = cliente;

                        }

                        if (usuario != null){
                            usuario.exibirMenu();
                            int acao = scanner.nextInt();
                            scanner.nextLine();
                        
                                if (usuario instanceof Cliente){
                                    Cliente c = (Cliente)usuario;


                                    if (acao == 1) {
                                        c.reservasConcluidas();
                                    }else if (acao == 2){
                                        c.reservasAbertas();
                                    }
                                }else if (usuario instanceof Atendente){

                                }
                        }else{
                            System.out.println("Opção invalida!");
                        }
                        
                        
                        

                        scanner.close();


            }
        
        
        }


    

}
