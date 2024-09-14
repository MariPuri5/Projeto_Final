package com.example.demo;

import java.util.ArrayList;
import java.util.List;

abstract class Usuario {
    private String nome;
    public List <Reserva> reservas;

    public Usuario(String nome) {
        this.nome = nome;
        this.reservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public abstract void exibirMenu();
}