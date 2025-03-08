package com.cinema.ingresso;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IngressoFamiliaTest {

    @Test
    void testGetValorRealComDesconto() {
        IngressoFamilia ingressoFamilia = new IngressoFamilia(20.0, "Filme Teste", true, 4);
        assertEquals(76.0, ingressoFamilia.getValorReal());
    }

    @Test
    void testGetValorRealSemDesconto() {
        IngressoFamilia ingressoFamilia = new IngressoFamilia(20.0, "Filme Teste", true, 2);
        assertEquals(40.0, ingressoFamilia.getValorReal());
    }

}
