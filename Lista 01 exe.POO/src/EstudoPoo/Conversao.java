package EstudoPoo;
/*
Escreva um programa que converta uma temperatura de Fahrenheit para Celsius. 
O usuário deve informar a temperatura em Fahrenheit e o programa deve calcular e 
exibir a temperatura correspondente em Celsius utilizando a fórmula: C = (F - 32) * 5/9.
OK FEITO */ 

public class Conversao {
    
    private double f;
 
    public double getF() {
        return f;
    }

    public void setF(double f) {
        if(f > 0){
           this.f = f; 
        } else System.out.println("Numero nao valido");
    }
    
    public double calculeTemp(){
        double C = (f - 32) * 5/9;
        return C;
    }
    
    
}
    /*essa classe recebe um número double;
        implemente getters e setters;
        implemente o método que calcule o pedido no enunciado;
        valide no setter do atributo se ele é maior que zero
    */
