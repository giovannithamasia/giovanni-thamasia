package exerciciosmanutencao.ex3;


import java.util.Scanner;

/**
 * 3)
 *
 * A classe concentra múltiplas responsabilidades:
 *
 * Dados do aluno.
 *
 * Dados do professor.
 *
 * Cálculo de média.
 *
 * Impressão de boletim.
 *
 * Viola o Princípio da Responsabilidade Única (SRP).
 *
 * Dificulta manutenção, testes e reutilização do código.
 */
public class SistemaEscolar {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        double [] notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("informe a "+(i+1) + " nota:");
            notas[i] = sc.nextDouble();
        }

        Materia m1 = new Materia("Matematica",100);

        Professor professor = new Professor("Gusta",m1,"N1-10");

        Aluno aluno  = new Aluno("Claudio",notas);

        Boletim boletim = new Boletim();

        boletim.imprimirBoletim(aluno,professor);
    }
}
