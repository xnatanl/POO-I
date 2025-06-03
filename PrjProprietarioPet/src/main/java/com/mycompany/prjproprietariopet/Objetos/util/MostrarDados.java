/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjproprietariopet.Objetos.util;

import com.mycompany.prjproprietariopet.Objetos.Endereco;
import com.mycompany.prjproprietariopet.Objetos.Pet;
import com.mycompany.prjproprietariopet.Objetos.Proprietario;
/**
 *
 * @author Natan
 */
public class MostrarDados {
    public void MostrarEndereco(Endereco endereco){
        if(endereco != null){
            System.out.println("\n********Endereco********");
            System.out.println("\nRua: " + endereco.getRua()
                                + "\nNumero: " + endereco.getNumero()
                                + "\nBairro: " + endereco.getBairro()
                                + "\nCidade: " + endereco.getCidade()
                                + "\nCep: " + endereco.getCep()
                                + "\nProprietario: " + endereco.getProprietario().getNome());
        }
    }
    
    public void MostrarPet(Pet pet){
        if(pet != null){
            System.out.println("\n********Pet********");
            System.out.println("\nNome: " + pet.getNome()
                                + "\nRaca: " + pet.getRaca()
                                + "\nTipo: " + pet.getTipo()
                                + "\nIdade: " + pet.getIdade()
                                + "\nPeso: " + pet.getPeso()
                                + "\nProprietario: " + pet.getProprietario().getNome());
        }      
    }
    
    public void MostrarProprietario(Proprietario proprietario){
            System.out.println("\n********Proprietario********");
            System.out.println("\nNome: " + proprietario.getNome()
                    + "\nCpf: " + proprietario.getCpf()
                    + "\nTelefone: " + proprietario.getTelefone()
                    + "\nEmail: " + proprietario.getEmail());
        
        if(proprietario.getLstPet() != null){
            System.out.println("\n********Pets********");
            for(Pet pet : proprietario.getLstPet()){
                System.out.println("\nNome: " + pet.getNome());
                System.out.println("Raca: " + pet.getRaca());
                System.out.println("Tipo: " + pet.getTipo());
            } 
        } else System.out.println("Nenhum pet encontrado\n");
        
        if(proprietario.getLstEndereco() != null){
            System.out.println("\n********Enderecos********");
            for(Endereco endereco : proprietario.getLstEndereco()){
                System.out.println("\nBairro: " + endereco.getBairro()
                        + "\nCep: " + endereco.getCep()
                        + "\nCidade: " + endereco.getCidade()
                        + "\nRua: " + endereco.getRua()
                        + "\nNumero: " + endereco.getNumero());
            }
        } else System.out.println("Nenhum endereco encontrado\n");
    }
    
}
