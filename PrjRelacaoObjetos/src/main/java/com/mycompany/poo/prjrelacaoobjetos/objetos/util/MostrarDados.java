/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.prjrelacaoobjetos.objetos.util;

import com.mycompany.poo.prjrelacaoobjetos.objetos.Contato;
import com.mycompany.poo.prjrelacaoobjetos.objetos.Pessoa;

/**
 *
 * @author Natan
 */
public class MostrarDados {
    public void MostrarDadosPessoa(Pessoa pessoa){
        System.out.println("*****Dados*****");
        System.out.println("ID: " + pessoa.getIdPessoa());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Data de Nascimento " + pessoa.getData_nascimento());
        
        System.out.println("*****Contatos*****");
        for(Contato contato : pessoa.getLstContato()){
            System.out.println("ID: " + contato.getIdContato());
            System.out.println("Tipo: " + contato.getTipoContato());
            System.out.println("Valor: " + contato.getValorContato());
        } 
    }
    
    
    public void MostrarDadosContato(Contato contato){
        System.out.println("****Contatos****");
        System.out.println("ID: " + contato.getIdContato());
        System.out.println("Tipo: " + contato.getTipoContato());
        System.out.println("Valor: " + contato.getValorContato());
        
        System.out.println("****Dados da Pessoa*****");
        System.out.println("ID: " + contato.getPessoa().getIdPessoa());
        System.out.println("Nome: " + contato.getPessoa().getNome());
        System.out.println("CPF: " + contato.getPessoa().getCpf());
        System.out.println("Data de Nascimento " + contato.getPessoa().getData_nascimento());
    }
}

 