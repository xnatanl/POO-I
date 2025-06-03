/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1ciceroPrjPolimofismo;

/**
 *polimorfismo
 * 
 * assumir varias formas
 * 
 * classes e metodos abstratos
 * 
 * @author Natan
 */
public class Principal {

    public static void main(String[] args) {
        Veiculo v = new Veiculo();
        Veiculo v1 = new Carro();
        Veiculo v2 = new Moto();
        Veiculo v3 = new Trator();
    }
    
}
