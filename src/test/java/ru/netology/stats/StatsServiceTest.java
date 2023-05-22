package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void sumSales() {
        StatsService service = new StatsService();
        int expected = 180; // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumSales(sales); // вызываем целевой метод:
        assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический):
    }

    @Test
    void avergSales() {
        StatsService service = new StatsService();
        double expected = 15;  // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.avergSales(sales); // вызываем целевой метод:
        assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический):
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        int expected = 9; // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(sales); // вызываем целевой метод:
        assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический):
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        int expected = 8; // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(sales); // вызываем целевой метод:
        assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический):
    }

    @Test
    void lessThanAvergSales() {
        StatsService service = new StatsService();
        int expected = 7; // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.lessThanAvergSales(sales); // вызываем целевой метод:
        assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический):
    }

    @Test
    void aboveAvergSales() {
        StatsService service = new StatsService();

        int expected = 7; // подготавливаем данные:
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.aboveAvergSales(sales); // вызываем целевой метод:
        assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический):
    }

}