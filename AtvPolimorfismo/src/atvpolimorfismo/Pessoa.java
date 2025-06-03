/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvpolimorfismo;

/**
 *
 * @author Natan
 */
public class Pessoa {
    private String nome;
    private double patrimonio;
    private String cpf;
    private String cnpj;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }
    
    public void CalcularImposto(){
        System.out.println("IMPOSTO SOBRE PATRIMONIO\n");
    }
    
    public void Validar(){
        System.out.println("\n");
    }
    
}
