package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateUtilsLLMTest {

    private final DateUtils utils = new DateUtils();

    @Test
    public void testLeapYearCommonCases() {
        assertTrue("2024 é bissexto", utils.isLeapYear(2024));
        assertFalse("2023 não é bissexto", utils.isLeapYear(2023));
    }

    @Test
    public void testLeapYearBoundaryCases() {
        assertTrue("Ano 400 (divisível por 400) é bissexto", utils.isLeapYear(400));
        assertFalse("Ano 100 (divisível por 100 mas não 400) não é bissexto", utils.isLeapYear(100));
        assertFalse("Ano negativo deve retornar false", utils.isLeapYear(-4));
    }

    @Test
    public void testSeasonTransitions() {
        assertEquals("Winter", utils.getSeason(12, 21)); // Início do Inverno
        assertEquals("Winter", utils.getSeason(1, 15));  // Meio do Inverno
        assertEquals("Spring", utils.getSeason(3, 21));  // Início da Primavera
        assertEquals("Summer", utils.getSeason(6, 21));  // Início do Verão
        assertEquals("Autumn", utils.getSeason(9, 21));  // Início do Outono
    }

    @Test
    public void testInvalidDates() {
        assertEquals("Invalid", utils.getSeason(13, 1));
        assertEquals("Invalid", utils.getSeason(5, 32));
    }
}