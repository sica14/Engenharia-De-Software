package seu.pacote;

/**
 * Representa um aluno matriculado na disciplina de Engenharia de Software.
 */
public final class Aluno {
    /** Nota da Avaliação Parcial 1 (AP1). */
    private double ap1;

    /** Nota da Avaliação Parcial 2 (AP2). */
    private double ap2;

    /** Nota da Avaliação Substitutiva (AS). */
    private double as;

    /**
     * Construtor para criar um aluno com as notas AP1 e AP2.
     *
     * @param notaAp1 Nota da primeira avaliação parcial.
     * @param notaAp2 Nota da segunda avaliação parcial.
     */
    public Aluno(final double notaAp1, final double notaAp2) {
        this.ap1 = notaAp1;
        this.ap2 = notaAp2;
        this.as = 0.0; // Inicializa a AS como 0.
    }

    /**
     * Obtém a nota da Avaliação Parcial 1 (AP1).
     *
     * @return A nota da AP1.
     */
    public double getAp1() {
        return ap1;
    }

    /**
     * Define a nota da Avaliação Parcial 1 (AP1).
     *
     * @param notaAp1 Nova nota da AP1.
     */
    public void setAp1(final double notaAp1) {
        this.ap1 = notaAp1;
    }

    /**
     * Obtém a nota da Avaliação Parcial 2 (AP2).
     *
     * @return A nota da AP2.
     */
    public double getAp2() {
        return ap2;
    }

    /**
     * Define a nota da Avaliação Parcial 2 (AP2).
     *
     * @param notaAp2 Nova nota da AP2.
     */
    public void setAp2(final double notaAp2) {
        this.ap2 = notaAp2;
    }

    /**
     * Obtém a nota da Avaliação Substitutiva (AS).
     *
     * @return A nota da AS.
     */
    public double getAs() {
        return as;
    }

    /**
     * Define a nota da Avaliação Substitutiva (AS).
     *
     * @param notaAs Nova nota da AS.
     */
    public void setAs(final double notaAs) {
        this.as = notaAs;
    }

    /**
     * Calcula a média do aluno com base nas notas atuais.
     *
     * @return A média aritmética entre AP1 e AP2.
     */
    public double calcularMedia() {
        return (this.ap1 + this.ap2) / 2;
    }

    /**
     * Aplica a avaliação substitutiva (AS), substituindo a menor nota.
     *
     * @param notaAs Nota da avaliação substitutiva.
     */
    public void aplicarSubstitutiva(final double notaAs) {
        this.as = notaAs;

        if (this.ap1 < this.ap2) {
            this.ap1 = notaAs;
        } else {
            this.ap2 = notaAs;
        }
    }
}
