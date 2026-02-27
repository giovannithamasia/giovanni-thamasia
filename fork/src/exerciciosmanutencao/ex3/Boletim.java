package exerciciosmanutencao.ex3;

public class Boletim {

    public void imprimirBoletim(Aluno aluno, Professor professor) {
        System.out.println("Aluno: " + aluno.getNomeAluno());
        System.out.println("Professor: " + professor.getNomeProfessor());
        System.out.println("Disciplina: " + professor.getMateria().getDisciplina());
        System.out.println("Carga horária: "+professor.getMateria().getCargaHoraria() + " hrs");
        System.out.println("Sala: " + professor.getSala());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Situação: "+ ((aluno.alunoAprovado()) ? "Aprovado"
                : "Reprovado"));

    }
}
