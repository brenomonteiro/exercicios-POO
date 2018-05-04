package sample.isp;

public class Drone extends Veiculo implements camera {

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }

    @Override
    public void ligarRadio() {
        // nada pra fazer aqui
    }

    @Override
    public void desligarRadio() {
        // nada pra fazer aqui
    }

    @Override
    public void ligarCamera() {
        cameraOn = true;
    }

    @Override
    public void desligarCamera() {
        cameraOn = false;
    }
}