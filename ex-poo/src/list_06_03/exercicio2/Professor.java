package lista_06_03_2018.exercicio2;

public class Professor extends Funcionario {
    private double salario;

    public Professor(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome, matricula, salario);
        this.salario = salario;
    }

    @Override
    public double getSalarioPrimeiraParcela() {
        return salario;
    }

    @Override
    public double getSalarioSegundaParcela() {
        return 0;
    }
}
