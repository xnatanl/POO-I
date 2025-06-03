/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auladaniela;

/**
 * 
 * @author Natan
 */
public class Calculadora {
    private int a;
    private int b;
    private int c;
    private int delta;
    private double xi;
    private double xii;
    private int xv;
    private int yv;

     public void calcularEquacao(int a, int b, int c){
        this.delta = (b*b)-4*a*c;
        this.xi = (-b + Math.sqrt(delta)) / (2 * a);
        this.xii = (-b - Math.sqrt(delta)) / (2 * a);
        this.xv = -b / (2 * a);
        this.yv = -(delta) / (4 * a);
    }
    public void MostrarResultado(){
        System.out.println("Resultado: "
                + "\nxi: " + xi
                + "\nxii: " + xii
                + "\nxv: " + xv
                + "\nyv: " + yv
                + "\ndelta: " + delta
                + "\n");
        
    }   
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getXii() {
        return xii;
    }

    public void setXii(double xii) {
        this.xii = xii;
    }

    public int getXv() {
        return xv;
    }

    public void setXv(int xv) {
        this.xv = xv;
    }

    public int getYv() {
        return yv;
    }

    public void setYv(int yv) {
        this.yv = yv;
    }
  
}
