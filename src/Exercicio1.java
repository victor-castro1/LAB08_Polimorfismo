import java.util.ArrayList;
import Exercicio1.*;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(5.0));
        formas.add(new Quadrado(7.0));
        formas.add(new Triangulo(3, 5));

        System.out.println("|-- Sistema Básico --|");
        System.out.println();

        for (int i = 0; i < formas.size(); i++) {
            Forma forma = formas.get(i);

            System.out.println("|-- Forma " + (i + 1) + " --|");

            forma.desenhar();
            double area = forma.calcularArea();
            System.out.printf("Área calculada: %.2f cm²\n", area);
            System.out.println();
        }

    }
}
