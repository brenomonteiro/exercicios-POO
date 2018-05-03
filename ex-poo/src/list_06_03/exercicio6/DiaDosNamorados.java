package lista_06_03_2018.exercicio6;

public class DiaDosNamorados extends CartaoWeb {
    private String destinatario;

    public DiaDosNamorados(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz dia dos namorados " + destinatario);
    }
}
