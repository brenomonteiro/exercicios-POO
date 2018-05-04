package sample.lsp;

import sample.lsp.Veiculoo;
import sun.font.CoreMetrics;

public class Carro extends Veiculoo {

    @Override
    public void mudaMarcha(Marcha marcha) {
        if(Marcha.R.equals(marcha) && getMarcha().equals(Marcha.D)){
            throw new RuntimeException("Não pode mudar para REVERSE quando " + getMarcha().toString() + " marcha está engatada!");
        }
    }

    public CoreMetrics getMarcha() {
        return marcha;
    }
}
