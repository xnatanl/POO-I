/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvpolimorfismo;

/**
 *
 * @author Natan
 */
public class Pj extends Pessoa {
    private String cnpj;
    private int anoAbertura;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getAnoAbertura() {
        return anoAbertura;
    }

    public void setAnoAbertura(int anoAbertura) {
        this.anoAbertura = anoAbertura;
    }
   
    public void Validar(){
        int tamanho = cnpj.length();
        if(tamanho == 14){
            System.out.println("CNPJ valido!\n");
        } else {
            System.out.println("CNPJ invalido\n");
        }
    }
    
    public void CalcularImposto(){
        System.out.println("Imposto sobre o lucro: 15%\n");
    }
    
    }             
