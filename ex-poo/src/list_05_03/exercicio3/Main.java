package lista_05_03_2018.exercicio3;

public class Main {
    public static void main(String[] Args){
        Leilao leilao = new Leilao("Celular", 15.2);
        Lance l1 = new Lance("Joao", 15.1); // Tem que exibir erro de valor
        Lance l2 = new Lance("Felipe", 15.5); // Tem que ganhar lideranca
        Lance l3 = new Lance("Matheus", 15.8); // Tem que ganhar lideranca
        Lance l4 = new Lance("Rodrigo", 15.1); // Tem que exibir erro de fechado


        leilao.registrarLance(l1);
        leilao.registrarLance(l2);
        leilao.registrarLance(l3);
        leilao.finalizar();
        leilao.registrarLance(l4);


    }
}
