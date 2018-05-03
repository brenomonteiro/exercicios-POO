package lista_06_03_2018.exercicio5;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args){
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
        Gerente g1 = new Gerente("Gerente", "1", 1500);
        Assistente a1 = new Assistente("Assistente", "2", 1000);
        Vendedor v1 = new Vendedor("Vendedor", "3", 500, 500);

        System.out.printf("%s recebe R$ %.2f\n",g1.getNome(),g1.calculaSalario());
        System.out.printf("%s recebe R$ %.2f\n",a1.getNome(),a1.calculaSalario());
        System.out.printf("%s recebe R$ %.2f\n",v1.getNome(),v1.calculaSalario());


    }
}
