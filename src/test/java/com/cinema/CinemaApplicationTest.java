//package com.cinema;
//
//import static com.github.stefanbirkner.systemlambda.SystemLambda.*;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class CinemaApplicationTest {
//
//    @Test
//    void testMeiaEntrada() throws Exception {
//        // Simula entradas do usuário
//        String input = "1\nFilme\ntrue\n20.0\n3\n"; // Opção 1 (Meia Entrada), nome do filme, dublado, valor, sair
//        String output = tapSystemOutNormalized(() -> withTextFromSystemIn(input).execute(() -> CinemaApplication.main(new String[]{})));
//
//        // Verifica a saída esperada
//        assertTrue(output.contains("Valor do ingresso: 10.0")); // Meia entrada deve ser metade do valor
//    }
//
//    @Test
//    void testIngressoFamiliaComDesconto() throws Exception {
//        // Simula entradas do usuário
//        String input = "2\nFilme\nfalse\n20.0\n4\n3\n"; // Opção 2 (Ingresso Família), nome do filme, legendado, valor, 4 pessoas, sair
//        String output = tapSystemOutNormalized(() -> withTextFromSystemIn(input).execute(() -> CinemaApplication.main(new String[]{})));
//
//        // Verifica a saída esperada
//        assertTrue(output.contains("Valor do ingresso: 76.0")); // 20 * 4 * 0.95 = 76 (desconto de 5%)
//    }
//
//    @Test
//    void testIngressoFamiliaSemDesconto() throws Exception {
//        // Simula entradas do usuário
//        String input = "2\nFilme\nfalse\n20.0\n2\n3\n"; // Opção 2 (Ingresso Família), nome do filme, legendado, valor, 2 pessoas, sair
//        String output = tapSystemOutNormalized(() -> withTextFromSystemIn(input).execute(() -> CinemaApplication.main(new String[]{})));
//
//        // Verifica a saída esperada
//        assertTrue(output.contains("Valor do ingresso: 40.0")); // 20 * 2 = 40 (sem desconto)
//    }
//
//}
