import Exercicio4.*;
import java.util.ArrayList;


public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Desenvolvedor("Hugo", "04040440", 00000, "Java"));
        funcionarios.add(new Estagiario("Aline", "123123123123", 00000));
        funcionarios.add(new Gerente("Yago", "123123123123", 12000, 1000));

        System.out.println();
        System.out.println("LISTA DE FUNCIONÁRIOS E SUAS ATIVIDADES:");
        System.out.println("~".repeat(60) + "\n");

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario func = funcionarios.get(i);

            System.out.println("--- FUNCIONÁRIO " + (i + 1) + " ---");
            System.out.println("Nome: " + func.getNome());
            System.out.println("Matrícula: " + func.getMatricula());
            System.out.printf("Salário: R$ %.2f\n", func.calcularSalario());

            func.realizarTarefa();

            System.out.println();
        }
    }
}
