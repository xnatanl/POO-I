package item_03;

public class Funcionario {
    private String nome;
    private double salario;
    
    public void calcularBonus(String mesPagamento) {
        if (mesPagamento.equals("Dezembro")){
            salario *= 1.10;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
