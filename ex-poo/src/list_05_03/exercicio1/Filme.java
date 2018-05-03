package lista_05_03_2018.exercicio1;

public class Filme {
    private String nome;
    private Cliente emprestado;

    public Filme(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmprestado(Cliente cliente) {
        this.emprestado = cliente;
    }

    public boolean getEmprestado() {
        return emprestado != null;
    }
}
