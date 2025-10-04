package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPrimeGenerator implements PrimeGenerator {

    @Override
    public List<Integer> getFirstNPrimes(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return List.of();
        }

        // Genera números desde 2, filtra los primos, limita a n, y los colecta en una lista
        return IntStream.iterate(2, i -> i + 1)
                .filter(StreamPrimeGenerator::isPrime)
                .limit(n)
                .boxed()
                .collect(Collectors.toList());
    }

    // Método privado para verificar si un número es primo
    private static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(number);
        return IntStream.rangeClosed(3, sqrt)
                .filter(i -> i % 2 != 0)
                .noneMatch(i -> number % i == 0);
    }
}
