package Exercicio4;

public class Gerente extends Funcionario {
    private double bonus;
    private double salarioBase;

    public Gerente(String nome, String matricula, double salarioBase, double bonus) {
        super(nome, matricula);
        this.bonus = bonus;
        this.salarioBase = salarioBase;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal = salarioBase + bonus;
        return salarioTotal;
    }

    public void realizarTarefa() {
        System.out.println("Gerente Rodrigo está gerenciado uma equipe");
    }
}
