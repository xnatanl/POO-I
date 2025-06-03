/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.poo.prjrelacaoobjetos.objetos;

import java.util.List;

/**
 *
 * @author Natan
 */
public class Pessoa {
    private int idPessoa;
    private String nome;
    private String data_nascimento;
    private String cpf;
    private List<Contato> lstContato;
    
    public List<Contato> getLstContato() {
        return lstContato;
    }

    public void setLstContato(List<Contato> lstContato) {
        this.lstContato = lstContato;
    }
    
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
