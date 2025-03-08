package com.cinema.ingresso;

public class MeiaEntrada extends Ingresso {
    public MeiaEntrada(double valor, String nomeFilme, boolean isDublado) {
        super(valor, nomeFilme, isDublado);
    }

    @Override
    public double getValorReal() {
        return getValor() / 2;
    }
}
