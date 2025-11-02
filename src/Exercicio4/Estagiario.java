package Exercicio4;

public class Estagiario extends Funcionario {
    private double bolsaAuxilio;

    public Estagiario(String nome, String matricula, double bolsaAuxilio) {
        super(nome, matricula);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return bolsaAuxilio;
    }

    @Override
    public void realizarTarefa() {
        String tarefa = "Estagiário: " + nome + " está aprendendo e auxiliando";
        System.out.println(tarefa);
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }
}
