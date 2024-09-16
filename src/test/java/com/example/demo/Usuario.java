package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String celular;
  

    

    public Usuario(String nome) {
        this.nome = nome;
        
    }
  
    public abstract void exibirMenu();
}