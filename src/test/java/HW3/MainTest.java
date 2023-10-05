package org.example.HW3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MainTest {

//    Задание 1.

    /**
     * Проверяем метод evenOddNumber с вводом четного числа
     * Ожидаем true
     */
    @Test
    void checkingWithEvenNumberInput() {
        assertTrue(Main.evenOddNumber(2));
    }

    /**
     * Проверяем метод evenOddNumber с вводом нечетного числа
     * Ожидаем false
     */
    @Test
    void checkingWithOddNumberInput() {
        assertFalse(Main.evenOddNumber(1));
    }

//    Задание 2.

    /**
     * Проверяем метод numberInInterval с вводом числа в интервале
     * Ожидаем true
     */
    @Test
    void checkingWithNumberInInterval() {
        assertTrue(Main.numberInInterval(30));
    }

    /**
     * Проверяем метод numberInInterval с вводом числа вне интервала
     * Ожидаем false
     */
    @Test
    void checkingWithNumberOutsideInterval() {
        assertFalse(Main.numberInInterval(24));
        assertFalse(Main.numberInInterval(101));
    }

}
