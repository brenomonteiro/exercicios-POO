package lista_06_03_2018.exercicio7;

public class Retangulo implements FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
