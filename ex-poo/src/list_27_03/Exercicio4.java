package lista_27_08_2018;

public class Exercicio4 {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        Conta c2 = new Conta("T2");
        c1.setTitular("T1");

        System.out.println(c1.getTitular() + "\n" + c2.getTitular());
    }
}
