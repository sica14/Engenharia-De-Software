package seu.pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        Aluno aluno1 = new Aluno(7.0, 8.0);
        Aluno aluno2 = new Aluno(6.0, 7.0);


        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        for(Aluno aluno: listaAlunos)   {
            double media = (aluno.getAp1() + aluno.getAp2()) / 2;
            if (media < 7 ) {
                System.out.println("Aluno precisa de uma terceira nota.");
                System.out.println("Digite uma terceira nota para o aluno: ");
                double as = scanner.nextDouble();
                double As = aluno.setAs(as);
                double ap1 = aluno.getAp1();
                double ap2 = aluno.getAp2();
                double As = aluno.getAs();

                if (As > ap1 && As < ap2) {
                    media = (As + ap2) / 2;
                    System.out.println("passou aqui");
                }
                else if (As > ap2 && As < ap1) {
                    media = (As + ap1) / 2;
                }
                else if (As > ap1 && ap1 == ap2) {
                    media = (As + ap1) / 2;
                }
                if (media < 7) {
                    System.out.println("Aluno reprovado");
                }
                else {
                    System.out.println("Aluno aprovado");
                }
            }
            else {
                System.out.println("O aluno foi aprovado.");
            }

        }
    }
}
