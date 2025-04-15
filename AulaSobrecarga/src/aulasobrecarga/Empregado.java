/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasobrecarga;

/**
 *
 * @author IFTM
 */
public class Empregado {
    String nome;
    String setor;
    double salario;

    public Empregado(String nome, String setor, double salario) {
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }
    
    /*public String mostrarInformacoes(){
        String aux = "Nome: " + this.nome + 
                "\nSetor: " + this.setor + 
                "\nSalario: R$" + this.salario;
        return aux;
    }*/
    
    @Override
    public String toString(){
        return "Empregado: [Nome: " + this.nome + ", "
                + " setor: " + this.setor + ", salario: " + this.salario + "]";
    }
    
}
