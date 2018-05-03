package lista_06_03_2018.exercicio1;

public class Amigo extends Pessoa{
    private String diaDoAniversario;

    public Amigo() {
    }

    public Amigo(String nome, char sexo, int idade, String diaDoAniversario) {
        super(nome, sexo, idade);
        this.diaDoAniversario = diaDoAniversario;
    }
}
