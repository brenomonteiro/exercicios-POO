package lista_06_03_2018.exercicio2;

public class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Pessoa() {
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
}
