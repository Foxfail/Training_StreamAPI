package com.foxfail;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // создаем стрим интов, отбираем из него три числа которые больше 60 и выводим их на экран
        IntStream.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x > 60).limit(3).forEach(System.out::println);
    }
}
