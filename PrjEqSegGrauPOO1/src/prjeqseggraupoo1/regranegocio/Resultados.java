/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjeqseggraupoo1.regranegocio;
import prjeqseggraupoo1.objetos.DadosSaida;
/**
 *
 * @author Natan
 */
public class Resultados {
    public void mostrarResultados(DadosSaida ds){
        System.out.println("DELTA: " + ds.getDelta());
        System.out.println("X1L: " + ds.getX1L());
        System.out.println("X2L: " + ds.getX2L());
        System.out.println("XV: " + ds.getxV());
        System.out.println("YV: " + ds.getyV());
       
    }
}
