package com.cinema.ingresso;

public abstract class Ingresso {
    private double valor;
    private String nomeFilme;
    private boolean isDublado;

    public Ingresso(double valor, String nomeFilme, boolean isDublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.isDublado = isDublado;
    }

    public abstract double getValorReal();

    public double getValor() {
        return valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public boolean isDublado() {
        return isDublado;
    }
}
