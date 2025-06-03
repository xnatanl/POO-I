/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo.prjrelacaoobjetos;

import com.mycompany.poo.prjrelacaoobjetos.objetos.Contato;
import com.mycompany.poo.prjrelacaoobjetos.objetos.Pessoa;
import com.mycompany.poo.prjrelacaoobjetos.objetos.util.MostrarDados;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Natan
 */
public class PrjRelacaoObjetos {

    public static void main(String[] args) {
        Contato c1 = new Contato();
        Contato c2 = new Contato();
        Contato c3 = new Contato();
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        c1.setIdContato(1);
        c1.setTipoContato("email");
        c1.setValorContato("teste@email.com");
        
        c2.setIdContato(2);
        c2.setTipoContato("email");
        c2.setValorContato("teste@email.com");
        
        c3.setIdContato(3);
        c3.setTipoContato("celular");
        c3.setValorContato("3440000000");
       
        p1.setIdPessoa(10);
        p1.setNome("Test 1");
        p1.setCpf("152.258.566-40");
        p1.setData_nascimento("01-01-2000");
        List<Contato> lstContato = new ArrayList<Contato>();
        lstContato.add(c1);
        lstContato.add(c3);
        c1.setPessoa(p1);
        c3.setPessoa(p1);
        p1.setLstContato(lstContato);
        
        p2.setIdPessoa(11);
        p2.setNome("Test 2");
        p2.setCpf("0000.00.000-44100");
        p2.setData_nascimento("02-02-2020");
        List<Contato> lstContato2 = new ArrayList<Contato>();
        lstContato.add(c2);
        c2.setPessoa(p2);
        p2.setLstContato(lstContato);
        
        MostrarDados md = new MostrarDados();
        
        md.MostrarDadosContato(c3);
        System.out.println("\n\n\n");
        md.MostrarDadosPessoa(p1);
    }
}
