package lista_06_03_2018.exercicio2;

public class Main {
    public static void main (String[] args){
        Pessoa pessoa1 = new Pessoa("João","Medeiros");
        Funcionario pessoa2 = new Funcionario("Leonardo", "Messias", 100,1000);
        Professor pessoa3 = new Professor("Antonio", "Silva", 200, 1500);

        System.out.println("Nomes completo:");
        System.out.println(pessoa1.getNomeCompleto());
        System.out.println(pessoa2.getNomeCompleto());
        System.out.println(pessoa3.getNomeCompleto());
        System.out.println("------------------------------");
        System.out.println("Salarios ---------------------");
        System.out.printf("Pessoa 2: \nPrimeira parcela: R$ %.2f\nSegunda parcela: R$ %.2f\n\n", pessoa2.getSalarioPrimeiraParcela(), pessoa2.getSalarioSegundaParcela());
        System.out.printf("Pessoa 3: \nPrimeira parcela: R$ %.2f\nSegunda parcela: R$ %.2f\n", pessoa3.getSalarioPrimeiraParcela(), pessoa3.getSalarioSegundaParcela());
    }
}
