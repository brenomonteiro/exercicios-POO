package lista_27_08_2018;

public class Exercicio2e3 {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setNumero(123);
//        conta.setSaldo(500.00);
        conta.setTitular("Felipe");

        System.out.println(conta.getTitular() + " " + conta.getNumero() + " " + conta.getSaldo());

		/* Os getters e setters devem ser criados apena na medida que forem necessarios para uso na aplicação  */

    }
}
