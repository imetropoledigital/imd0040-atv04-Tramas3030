package br.ufrn.imd;

public class Gerente extends Funcionario {
    private Nivel nivel;

    public Gerente(int chMensal, double hh, Nivel nivel) {
        super(chMensal, hh);
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario() {
        return (chMensal * hh) + nivel.getBonus();
    }

    public enum Nivel {
        JUNIOR(1000.00), PLENO(2000.00), SENIOR(3000.00);

        private double bonus;

        Nivel(double bonus) {
            this.bonus = bonus;
        }

        public double getBonus() {
            return bonus;
        }

        public static Nivel valueOf(String name) {
            return Nivel.valueOf(name.toUpperCase());
        }

        public static Nivel[] values() {
            return Nivel.values();
        }
    }
}
