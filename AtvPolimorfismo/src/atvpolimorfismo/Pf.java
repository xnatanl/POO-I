/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvpolimorfismo;

/**
 *
 * @author Natan
 */
public class Pf extends Pessoa {
    private String cpf;
    private String genero;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void Validar(){
        int tamanho = cpf.length();
        if(tamanho == 11){
            System.out.println("CPF valido!\n");
        } else {
            System.out.println("CPF invalido\n");
        }
    }
    
    public void CalcularImposto(){
        System.out.println("Imposto de renda: 2.0%\n");
  
    }
}
