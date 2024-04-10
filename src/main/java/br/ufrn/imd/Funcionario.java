package br.ufrn.imd;

public class Funcionario {
    protected double hh;
    protected int chMensal;

    public Funcionario(int chMensal, double hh) {
        this.chMensal = chMensal;
        this.hh = hh;
    }

    public double calcularSalario() {
        return chMensal * hh;
    }


}
