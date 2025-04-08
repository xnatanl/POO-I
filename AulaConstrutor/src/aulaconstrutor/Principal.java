package aulaconstrutor;

public class Principal {

    public static void main(String[] args) {
        Professor jean = new Professor("Jean", "ADS");
        Professor ligia = new Professor("Ligia");
        Professor pauloCesar = new Professor();
        
        System.out.println("\nProfessor(a): " + jean.getNome() 
            + "\nDepartamento: " + jean.getDepartamento());
        
        System.out.println("\nProfessor(a): " + ligia.getNome() 
            + "\nDepartamento: " + ligia.getDepartamento());

        System.out.println("\nProfessor(a): " + pauloCesar.getNome() 
            + "\nDepartamento: " + pauloCesar.getDepartamento());
    }
}
