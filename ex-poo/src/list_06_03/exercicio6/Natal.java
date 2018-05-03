package lista_06_03_2018.exercicio6;

public class Natal extends CartaoWeb {
    private String destinatario;

    public Natal(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz natal " + destinatario);
    }
}
