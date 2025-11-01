package Exercicio1;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double areaQuadrado = lado * lado;
        return areaQuadrado;
    }

    public void desenhar() {
        System.out.println("Desenhando um quadrado com o lado = " + lado + "cm");
    }
}
