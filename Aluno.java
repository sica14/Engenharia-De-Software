package seu.pacote;


import java.util.Scanner;

public class Aluno {
    private double ap1;
    private double ap2;
    private double as;


    public Aluno(double ap1, double ap2) {
        this.ap1 = ap1;
        this.ap2 = ap2;
    }

    public double getAp1() {
        return ap1;
    }

    public void setAp1(double ap1) {
        this.ap1 = ap1;
    }

    public double getAp2() {
        return ap2;
    }

    public void setAp2(double ap2) {
        this.ap2 = ap2;
    }

    public double getAs() {
        return as;
    }

    public void setAs(double as) {
        this.as = as;
    }
}