package com.cinema.ingresso;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeiaEntradaTest {

    @Test
    void testGetValorReal() {
        MeiaEntrada meiaEntrada = new MeiaEntrada(20.0, "Filme Teste", true);
        assertEquals(10.0, meiaEntrada.getValorReal());
    }

}
