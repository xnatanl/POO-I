package EstudoPoo;

/*
    Desenvolva um programa que leia um número inteiro positivo e calcule 
o fatorial desse número. O fatorial de um número n é o produto de todos os números 
inteiros positivos de 1 até n (n!). OK FEITO
*/
public class Fatorial 
{
    //essa classe recebe um número inteiro;
    
    private int n;

    
    // implemente getters e setters;
    public int getNumeroInteiroPositivo() {
        return n;
    }
    // valide no setter do atributo se ele é positivo
    public void setNumeroInteiroPositivo(int n) {
        if(n > 0){
            this.n = n;
        }else this.n = 1;
    }
    
    //implemente o método que calcule o pedido no enunciado;
    public long calculeFatorial() {
        long res = 1;
        for (int i = 2; i <= n; i++){
            res *= i;
        }
        return res;
    }
    
       
    
    
    
}
