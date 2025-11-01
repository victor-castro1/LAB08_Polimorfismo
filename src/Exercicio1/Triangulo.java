package Exercicio1;

public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double areaTriangulo = (base * altura) / 2;
        return areaTriangulo;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Triangulo com a base = " + base + " e com a altura = " + altura);
    }
}
