/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjproprietariopet;

import com.mycompany.prjproprietariopet.Objetos.Proprietario;
import com.mycompany.prjproprietariopet.Objetos.Endereco;
import com.mycompany.prjproprietariopet.Objetos.Pet;
import com.mycompany.prjproprietariopet.Objetos.util.MostrarDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Natan
 */
public class PrjProprietarioPet {

    public static void main(String[] args) {
        
        Proprietario prop1 = new Proprietario();
        Proprietario prop2 = new Proprietario();
        Proprietario prop3 = new Proprietario();
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        Pet pet3 = new Pet();
        Endereco end1 = new Endereco();
        Endereco end2 = new Endereco();
        Endereco end3 = new Endereco();
        MostrarDados md = new MostrarDados();
        Scanner sc = new Scanner(System.in);
        
        pet1.Pet("gato1", 3, "de rua", "siames", 10, null);
        pet2.Pet("gato2", 4, "de raca", "persa", 12, null);
        pet3.Pet("gato3", 5, "raivoso", "tricolor", 14, null);
        
        end1.Endereco("Rua Italia", "1232", "Centro", "Ptc", "12345-000", null);
        end2.Endereco("Rua 1", "456", "Bairro Sta Terezinha", "Patos de Minas", "54321-000", null);
        end3.Endereco("Av. Brasil", "159", "Belvedere", "Uberaba", "15963-123", null);
        
        List<Pet> lstPetProp1 = new ArrayList<>();
        List<Pet> lstPetProp2 = new ArrayList<>();
        
        lstPetProp1.add(pet1);
        lstPetProp1.add(pet2);
        lstPetProp2.add(pet3);
        
        List<Endereco> lstEnderecoProp1 = new ArrayList<>();
        List<Endereco> lstEnderecoProp2 = new ArrayList<>();
        
        lstEnderecoProp1.add(end1);
        lstEnderecoProp1.add(end2);
        lstEnderecoProp2.add(end3);
        
        prop1.Proprietario("natan", "152.256.543-13", "1234-5678", "natan@email.com", lstPetProp1, lstEnderecoProp1);
        prop2.Proprietario("joao", "258.256.543-73", "1853-5691", "joao@email.com", lstPetProp2, lstEnderecoProp2);
        
        
        pet1.setProprietario(prop1);
        pet2.setProprietario(prop1);
        pet3.setProprietario(prop2);
        
        end1.setProprietario(prop1);
        end2.setProprietario(prop1);
        end3.setProprietario(prop2);
        
        md.MostrarProprietario(prop1);
        md.MostrarEndereco(end3);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*Pet pet1 = new Pet();
        Endereco end = new Endereco();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInforme os dados do Proprietario\nNome:\nCpf:\nTelefone:\nEmail:\n");
        String nomeProp = sc.next();
        String cpf = sc.next();
        String telefone = sc.next();
        String email = sc.next();
        
        List<Pet> lstPet = new ArrayList<Pet>();
        //lstPet.add(pet1);
        List<Endereco> lstEndereco = new ArrayList<Endereco>();
        //lstEndereco.add(end);
        prop1.Proprietario(nomeProp, cpf, telefone, email, lstPet, lstEndereco);
        
        System.out.println("\nInforme o Endereco*\nRua:\nNumero:\nBairro:\nCidade:\nCep:\n");
        String rua = sc.next();
        String numero = sc.next();
        String bairro = sc.next();
        String cidade = sc.next();
        String cep = sc.next(); 
        end.Endereco(rua, numero, bairro, cidade, cep, prop1); 
        
        System.out.println("\nInforme os dados do Pet\nNome\nIdade\nTipo\nRaca\nPeso");
        String nomePet = sc.next();
        int idade = sc.nextInt();
        String tipo = sc.next();
        String raca = sc.next();
        float peso = sc.nextFloat();
        pet1.Pet(nomePet, idade, tipo, raca, peso, prop1);
        
        */
        
        
       
        
    }
}
