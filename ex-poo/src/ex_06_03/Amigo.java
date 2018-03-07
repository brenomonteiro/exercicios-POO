package ex_06_03;

public class Amigo extends Pessoa {

    private String diaDoAniversario;



    public Amigo(String nome, char sexo, int idade, String diaDoAniversario) {
        super(nome, sexo, idade);
        this.diaDoAniversario = diaDoAniversario;
    }
}
