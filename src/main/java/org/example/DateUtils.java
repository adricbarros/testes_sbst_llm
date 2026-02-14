package org.example;

public class DateUtils {
    // Verifica se o ano é bissexto
    public boolean isLeapYear(int year) {
        if (year < 0) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Retorna a estação do ano (Hemisfério Norte para fins de lógica complexa)
    public String getSeason(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) return "Invalid";
        if ((month == 12 && day >= 21) || month <= 2 || (month == 3 && day < 21)) return "Winter";
        if ((month == 3 && day >= 21) || month <= 5 || (month == 6 && day < 21)) return "Spring";
        if ((month == 6 && day >= 21) || month <= 8 || (month == 9 && day < 21)) return "Summer";
        return "Autumn";
    }
}