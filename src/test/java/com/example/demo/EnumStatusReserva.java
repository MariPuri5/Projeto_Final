package com.example.demo;

public enum EnumStatusReserva {

        ABERTO("Em aberto."),
        CONCLUIDO("Concluído."),
        CANCELADA("Reserva cancelada.");


        private final String statusReserva;

        EnumStatusReserva(String statusReserva) {
        this.statusReserva = statusReserva;
        }

        public String getEnumStatusReserva(){
            return statusReserva;
        }
      
    

}
