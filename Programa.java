package seu.pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe principal do programa para gerenciar alunos e calcular médias.
 */
public final class Programa {

    /** Nota mínima para aprovação. */
    private static final double NOTA_MINIMA = 7.0;

    /** Primeira nota do primeiro aluno. */
    private static final double NOTA1_ALUNO1 = 7.0;

    /** Segunda nota do primeiro aluno. */
    private static final double NOTA2_ALUNO1 = 8.0;

    /** Primeira nota do segundo aluno. */
    private static final double NOTA1_ALUNO2 = 6.0;

    /** Segunda nota do segundo aluno. */
    private static final double NOTA2_ALUNO2 = 7.0;

    /** Primeira nota do terceiro aluno. */
    private static final double NOTA1_ALUNO3 = 5.0;

    /** Segunda nota do terceiro aluno. */
    private static final double NOTA2_ALUNO3 = 6.5;

    /**
     * Construtor privado para evitar instâncias desta classe utilitária.
     */
    private Programa() {
        throw new UnsupportedOperationException(
                "Esta é uma classe utilitária e não deve ser instanciada."
        );
    }

    /**
     * Método principal que executa o programa.
     *
     * @param args Argumentos da linha de comando (não utilizado).
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> listaAlunos = new ArrayList<>();

        // Adicionando alunos à lista
        listaAlunos.add(new Aluno(NOTA1_ALUNO1, NOTA2_ALUNO1));
        listaAlunos.add(new Aluno(NOTA1_ALUNO2, NOTA2_ALUNO2));
        listaAlunos.add(new Aluno(NOTA1_ALUNO3, NOTA2_ALUNO3));

        for (Aluno aluno : listaAlunos) {
            double media = aluno.calcularMedia();
            System.out.println("Aluno com AP1: " + aluno.getAp1()
                    + ", AP2: " + aluno.getAp2());
            System.out.printf("Média inicial: %.2f%n", media);

            if (media < NOTA_MINIMA) {
                System.out.println(
                        "Aluno precisa de avaliação substitutiva (AS)."
                                + " Digite a nota:"
                );
                double as = scanner.nextDouble();
                aluno.aplicarSubstitutiva(as);

                media = aluno.calcularMedia();
                System.out.printf("Nova média após AS: %.2f%n", media);
            }

            if (media >= NOTA_MINIMA) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("----------------------------");
        }

        scanner.close();
    }
}
