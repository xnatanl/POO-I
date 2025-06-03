/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvpolimorfismo;

/**
 *
 * @author Natan
 */
public class Principal {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.CalcularImposto();
        Pessoa p1 = new Pf();
        p1.setCpf("15225856644");
        p1.CalcularImposto();
        p1.Validar();
        Pessoa p2 = new Pj();
        p2.setCnpj("17840166000118");
        p2.CalcularImposto();
        p2.Validar();
        
     
        
    }
    
}
