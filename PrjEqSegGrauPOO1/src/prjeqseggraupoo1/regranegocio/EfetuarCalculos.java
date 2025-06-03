/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjeqseggraupoo1.regranegocio;

import prjeqseggraupoo1.objetos.DadosSaida;
import prjeqseggraupoo1.objetos.DadosEntrada;

/**
 *
 * @author Natan
 */
public class EfetuarCalculos {
    public DadosSaida calcularDelta(DadosEntrada de){
        DadosSaida ds = new DadosSaida();
        ds.setDelta((de.getB() * de.getB()) - 4*de.getA() * de.getC());
        return ds;   
    }
    
}
