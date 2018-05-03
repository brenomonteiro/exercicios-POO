package lista_06_03_2018.exercicio6;

public class Main {
    public static void main(String[] args) {
        CartaoWeb c1 = new Natal("Gabriel");
        CartaoWeb c2 = new Aniversario("Laura");
        CartaoWeb c3 = new DiaDosNamorados("Joao");

        CartaoWeb cartoes[] = {c1, c2, c3};

        for (int i = 0; i < cartoes.length; i++) {
            cartoes[i].showMessage();
        }


    }

}
