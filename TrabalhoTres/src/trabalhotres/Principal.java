
package trabalhotres;

public class Principal {

   
    public static void main(String[] args) {
      
        //Objetos funcionario
        
        Funcionario fernando = new Funcionario();
        fernando.setNome("Fernando");
        fernando.setSalario(2000.00);
        fernando.calcularBonus("Dezembro");         
        System.out.println("\nFuncionario: " + fernando.getNome() + "\nSalario para o mes dezembro: " + "\nR$ " + fernando.getSalario());

        Funcionario fatima = new Funcionario();
        fatima.setNome("Fatima");
        fatima.setSalario(2300.00);
        fatima.calcularBonus("Outubro"); 
        System.out.println("\nFuncionario: " + fatima.getNome() + "\nSalario para o mes outubro: " + "\nR$ " + fatima.getSalario());
        
        Funcionario fabio = new Funcionario();
        fabio.setNome("Fabio");
        fabio.setSalario(350.50);
        fabio.calcularBonus("Dezembro");             
        System.out.println("\nFuncionario: " + fabio.getNome() + "\nSalario para o mes dezembro: " + "\nR$ " + fabio.getSalario());
       
        // Objetos gerente
        
        Gerente gustavo = new Gerente();
        gustavo.setNome("Gustavo");
        gustavo.setSalario(2300);
        gustavo.calcularBonus("Dezembro");
        gustavo.setGratificacao(250);
        System.out.println("\nGerente: " + gustavo.getNome() + "\nSalario para o mes dezembro: " + "\nR$" + gustavo.calcularSalarioGraficado());
        
        Gerente guto = new Gerente();
        guto.setNome("Guto");
        guto.setSalario(2300);
        guto.calcularBonus("Novembro");
        guto.setGratificacao(250);
        System.out.println("\nGerente: " + guto.getNome() + "\nSalario para o mes dezembro: " + "\nR$" + guto.calcularSalarioGraficado());        
     
        Gerente gina = new Gerente();
        gina.setNome("Gina");
        gina.setSalario(2300);
        gina.calcularBonus("Outubro");
        gina.setGratificacao(450);
        System.out.println("\nGerente: " + gina.getNome() + "\nSalario para o mes dezembro: " + "\nR$" + gina.calcularSalarioGraficado());    
        
        // Objetos programador
        
        Programador pedro = new Programador();
        pedro.setNome("Pedro");
        pedro.setSalario(3000.00);
        pedro.calcularBonus("Novembro");
        pedro.setValorPontoFuncao(100.00);   
        double valorSoftwarePedro = pedro.calcularValorSoftware(200);
        System.out.println("\nO orcamento do software de " + pedro.getNome() + " eh de R$ " + valorSoftwarePedro);
    
        Programador paulo = new Programador();
        paulo.setNome("Paulo");
        paulo.setSalario(3000.00);
        paulo.calcularBonus("Dezembro");
        paulo.setValorPontoFuncao(100.00);   
        double valorSoftwarePaulo = paulo.calcularValorSoftware(20);
        System.out.println("\nO orcamento do software de " + paulo.getNome() + " eh de R$ " + valorSoftwarePaulo);
    
        Programador pamela = new Programador();
        pamela.setNome("Pamela");
        pamela.setSalario(300.00);
        pamela.calcularBonus("Dezembro");
        pamela.setValorPontoFuncao(1550.00);   
        double valorSoftwarePamela = pamela.calcularValorSoftware(15);
        System.out.println("\nO orcamento do software de " + pamela.getNome() + " eh de R$ " + valorSoftwarePamela);
        
    }
    
}
