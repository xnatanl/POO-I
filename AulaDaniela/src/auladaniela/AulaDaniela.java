package auladaniela;

import java.util.Scanner;

public class AulaDaniela {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora n1 = new Calculadora();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        n1.calcularEquacao(a, b, c);
        n1.MostrarResultado();
    }
    
}
