package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Cliente extends Usuario {

    private int diarias;


    public static List <Reserva> reservas = new ArrayList<Reserva>();
    public Cliente(String nome, int diarias) {
        super(nome);
        this.diarias=diarias;
        
        
    }
// Apos cadastrar o cliente, aparecer msg o check in e realizado pagamento pendente.
// apos pagamento, reserva concluida. 
//Pagamento não caiu, reserva em aberto. 
//Na hora do chek out pedir feedback.
// hotel oferecer passeios, cafe da manha, spa e piscina.
//


    @Override
    public void exibirMenu() {
        
        
            System.out.println("----Menu Cliente----");
            System.out.println("1 - Reservas concluídas");
         System.out.println("2 - Reservas abertas");
    }
        public void reservasConcluidas(){
             
            if (reservas.isEmpty()){
            System.out.println("Reserva não encontrada");
            
            }else {
                System.out.println("Reservas");
                for (int i = 0; i <reservas.size(); i++) {
                    System.out.println((i+1)+ "Nome do cliente: " + Cliente.get(i).getNome() + Cliente.get(i).getCpf);
                                        
                }

            }


            boolean achouReserva = false;

                for (Reserva reserva: reservas){
                    if (reserva.getStatus().equals("Concluída")){
                        System.out.println(reserva);
                    

                        achouReserva = true;
                    }
                }
                        if (! achouReservas){
                            System.out.println("Reserva não encontrada.");
    
                        }
    
                    }
                }
        

        public void reservasAbertas () {

            System.out.println("Reservas abertas: ");
                for (Reserva reserva: reservas){
                    if (reserva.getStatus().equals("Em aberto")){
                        System.out.println(reserva);
                    }
                }
        }     if (! achouReserva){
            System.out.println("Reserva não encontrada.");
        }          



