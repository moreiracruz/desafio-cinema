package com.cinema.ingresso;

public class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, boolean isDublado, int numeroPessoas) {
        super(valor, nomeFilme, isDublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getValorReal() {
        double valorTotal = getValor() * numeroPessoas;
        if (numeroPessoas > 3) {
            valorTotal *= 0.95; // 5% de desconto
        }
        return valorTotal;
    }

}
