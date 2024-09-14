package com.example.demo;

public class Reserva{

    public  String id;
    public  String status;

    public Reserva(String id, String status){
        this.id=id;
        this.status=status;
    }

    public String getId(){
        return id;
    }
    public String setId(){
        return id;
    }
    public String getStatus(){
        return status;
    }

    public String toString(){
        return "ID da Reserva: " + id + "Status da Reserva: " + status;
    }


        public void verReservasConcluidas () {
                System.out.println("Reservas concluídas");

                
        
                for(Reserva reserva: ){
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