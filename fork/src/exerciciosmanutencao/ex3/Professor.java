package exerciciosmanutencao.ex3;

public class Professor {

    private String nomeProfessor;
    private Materia materia;
    private String sala;


    public Professor(String nomeProfessor, Materia materia, String sala) {
        this.nomeProfessor = nomeProfessor;
        this.materia = materia;
        this.sala = sala;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
