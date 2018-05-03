package lista_05_03_2018.exercicio3;

import java.util.ArrayList;

public class Leilao {
    private Lance vencedor;
    private String item;
    private double valorInicial;
    private boolean status;
    private ArrayList<Lance> historicoLances;

    public Leilao(String item, double valorInicial) {
        this.item = item;
        this.valorInicial = valorInicial;
        this.status = true;
        this.historicoLances = new ArrayList<>();
        this.vencedor = new Lance("Inicial", valorInicial);
    }

    public void registrarLance(Lance l) {
        if ((l.getValor() > valorInicial && l.getValor() > this.vencedor.getValor()) && isStatus()) {
            this.vencedor = l;
            historicoLances.add(l);
        } else if (!isStatus()) {
            System.out.println("ERRO - " + l.getAutor() + " leilão encerrado, nao é possivel enviar mais lances!");
        } else {
            System.out.printf("ERRO - Lance deve ser maior que %.2f!\n", vencedor.getValor());
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void finalizar() {
        this.status = false;
        System.out.println("* ---------------------------------------- *");
        System.out.println("* Bem leiloado: " + item);
        System.out.println("* Vencedor do leilao: " + vencedor.getAutor());
        System.out.printf("* Com o lance de: R$ %.2f\n", vencedor.getValor());
        System.out.println("\n* Histórico de lances:");

        int i = 1;
        for (Lance l : historicoLances) {
            System.out.printf("%d - Autor: %s - Valor: %.2f\n", i, l.getAutor(), l.getValor());
            i++;
        }

        System.out.println("* ---------------------------------------- *");

    }
}
