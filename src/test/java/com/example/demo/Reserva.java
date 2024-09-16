package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reserva{

    private  String id;
    private EnumStatusReserva status;
    boolean achouReserva = false;

    public Reserva(String id, EnumStatusReserva status){
        this.id=id;
        this.status=status;
    }

    public String getId(){
        return id;
    }
    public String setId(){
        return id;
    }
    public EnumStatusReserva getStatus(){
        return status;
    }

    public String toString(){
        return "ID da Reserva: " + id + "Status da Reserva: " + status;
    }


        public void verReservasConcluidas () {
                System.out.println("Reservas concluídas");

                
        
                for(Reserva reserva: ListadeReserva){
                    if (reserva.getStatus().equals("Concluída")){
                        System.out.println(reserva);
                        achouReserva = true;
                    }
                }
               
                public void verReservasAbertas () {

                    for(Reserva reserva: reservas){
                        if (reserva.getStatus().equals("Aberta")){
                            System.out.println(reserva);
                            achouReservas = true;
                            }
    
    
                    }
                      


                }

}
}