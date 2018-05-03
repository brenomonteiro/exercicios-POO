package lista_06_03_2018.exercicio5;

public class Assistente extends Funcionario {
    public Assistente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calculaSalario(){
        return getSalarioBase();
    }
}
