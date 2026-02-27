package exerciciosmanutencao.ex3;

public class Materia {

    private String disciplina;
    private int cargaHoraria;

    public Materia(String disciplina, int cargaHoraria) {
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
