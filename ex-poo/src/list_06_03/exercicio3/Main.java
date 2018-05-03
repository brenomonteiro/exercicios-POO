package lista_06_03_2018.exercicio3;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Poupanca p1 = new Poupanca();

        c1.depositar(10000);
        c1.sacar(15000);
        p1.depositar(15000);
        p1.sacar(20000);

        System.out.printf("Saldo conta: R$ %.2f\n", c1.getSaldo());
        System.out.printf("Saldo poupanca: R$ %.2f\n", p1.getSaldo());

    }

}
