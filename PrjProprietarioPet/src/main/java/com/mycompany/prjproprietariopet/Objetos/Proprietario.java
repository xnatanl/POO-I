/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjproprietariopet.Objetos;

import java.util.List;
/**
 *
 * @author Natan
 */
public class Proprietario {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private List<Pet> lstPet;
    private List<Endereco> lstEndereco;
    
    public void Proprietario(String nome,   
                             String cpf, 
                             String telefone, 
                             String email, 
                             List<Pet> lstPet, 
                             List<Endereco> lstEndereco){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.lstPet = lstPet;
        this.lstEndereco = lstEndereco;
    }

    public List<Endereco> getLstEndereco() {
        return lstEndereco;
    }

    public void setLstEndereco(List<Endereco> lstEndereco) {
        this.lstEndereco = lstEndereco;
    }

    public List<Pet> getLstPet() {
        return lstPet;
    }

    public void setLstPet(List<Pet> lstPet) {
        this.lstPet = lstPet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
