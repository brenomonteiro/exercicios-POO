package lista_06_03_2018.exercicio5;

public class Gerente extends Funcionario {
    private double salarioBase;

    public Gerente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calculaSalario(){
        return salarioBase * 2;
    }
}
