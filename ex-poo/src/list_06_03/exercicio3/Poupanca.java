package lista_06_03_2018.exercicio3;

public class Poupanca extends Conta {
    private int diaRendimento;
    private double saldo;

    public Poupanca(double saldo, int diaRendimento) {
        super(saldo);
        this.diaRendimento = diaRendimento;
        this.saldo = saldo;
    }

    public Poupanca() {
    }

    public void setSaldo(double valor) {
        if (valor > 0) {
            saldo = valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (saldo - valor > 0) {
            saldo -= valor;
        }
    }
}
