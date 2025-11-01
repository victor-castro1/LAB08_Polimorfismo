package Exercicio1;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        double areaCirculo = Math.PI * (raio * raio);
        return areaCirculo;
    }

    public void desenhar() {
        System.out.println("Desenhando um círculo com raio de = " + raio + "cm");
    }
}
