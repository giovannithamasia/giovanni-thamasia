package exerciciosmanutencao.ex3;

public class Aluno {

    private String nomeAluno;
    private double[] notas;

    public Aluno(String nomeAluno, double[] notas) {
        this.nomeAluno = nomeAluno;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }

    public boolean alunoAprovado() {
        return calcularMedia() >= 7;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
