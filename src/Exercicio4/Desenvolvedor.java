package Exercicio4;

public class Desenvolvedor extends Funcionario {
    private String linguagemPreferida;
    private double salarioBase;

    public Desenvolvedor(String nome, String matricula, double salarioBase, String linguagemPreferida) {
        super(nome, matricula);
        this.linguagemPreferida = linguagemPreferida;
        this.salarioBase = salarioBase;
    }

    public String getLinguagemPreferida() {
        return linguagemPreferida;
    }

    public double calcularSalario(int anosExperiencia) {
        double bonusExperiencia = salarioBase * 0.10 * anosExperiencia;
        return bonusExperiencia;
    }

    public void realizarTarefa() {
        System.out.println("O desenvolvedor: " + nome + " está codificando em: " + linguagemPreferida);
    }

}
