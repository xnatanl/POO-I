/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjeqseggraupoo1;

import java.util.Scanner;
import prjeqseggraupoo1.objetos.DadosEntrada;
import prjeqseggraupoo1.objetos.DadosSaida;
import prjeqseggraupoo1.regranegocio.EfetuarCalculos2;
import prjeqseggraupoo1.regranegocio.Resultados;

/**
 *
 * @author Natan
 */
public class PrjEqSegGrauPOO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        DadosEntrada de = new DadosEntrada();
        de.setA(a);
        de.setB(b);
        de.setC(c);
        
        DadosSaida ds = new DadosSaida();
        EfetuarCalculos2 ec = new EfetuarCalculos2();
        ec.calcularDelta(de, ds);
        ec.calcularX1L(de, ds);
        ec.calcularX2L(de, ds);
        ec.calcularXv(de, ds);
        ec.calcularYv(de, ds);
        Resultados res = new Resultados();
        res.mostrarResultados(ds);
        
    }
    
}
