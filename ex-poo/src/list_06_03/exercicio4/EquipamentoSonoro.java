package lista_06_03_2018.exercicio4;

public class EquipamentoSonoro extends Equipamento {
    private int volume;
    private boolean stereo;


    public void mono(){
        stereo = false;
    }

    public void stereo(){
        stereo = true;
    }

    @Override
    public void liga(){
        super.liga();
        volume = 5;
    }

}
