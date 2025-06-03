/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjeqseggraupoo1.regranegocio;

import prjeqseggraupoo1.objetos.DadosEntrada;
import prjeqseggraupoo1.objetos.DadosSaida;

/**
 *
 * @author Natan
 */
public class EfetuarCalculos2 {
    public DadosSaida calcularDelta(DadosEntrada de, DadosSaida ds){
        ds.setDelta((de.getB() * de.getB()) - 4*de.getA() * de.getC());
        return ds;   
    }
    
    public DadosSaida calcularX1L(DadosEntrada de, DadosSaida ds){
        ds.setX1L((float) ((-de.getB() + Math.sqrt(ds.getDelta())) / (2 * de.getA())));
        return ds;   
                                                               
    }
    
    public DadosSaida calcularX2L(DadosEntrada de, DadosSaida ds){
        ds.setX2L((float) ((-de.getB() - Math.sqrt(ds.getDelta())) / (2 * de.getA())));
        return ds; 
                                                                 
    }
    
    public DadosSaida calcularXv(DadosEntrada de, DadosSaida ds){
        ds.setxV((float) (-de.getB() / (2 * de.getA())));
        return ds;   
                                                             
    }
    
    public DadosSaida calcularYv(DadosEntrada de, DadosSaida ds){
        ds.setyV((float) (-ds.getDelta() / (4*de.getA())));
        return ds;   
                                                            
    }
}
              

