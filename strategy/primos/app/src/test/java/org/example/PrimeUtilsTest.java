package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class PrimeUtilsTest {

    //metodo que provee todas las combinaciones de estrategias y generadores
    static Stream<Arguments> generatorAndOutputProvider() {
        return Stream.of(
            Arguments.of(new RecursivePrimeGenerator(), new ConsoleOutputStrategy()),
            Arguments.of(new RecursivePrimeGenerator(), new FileOutputStrategy("primos_recursive.txt")),
            Arguments.of(new IterativePrimeGenerator(), new ConsoleOutputStrategy()),
            Arguments.of(new IterativePrimeGenerator(), new FileOutputStrategy("primos_iterative.txt")),
            Arguments.of(new StreamPrimeGenerator(), new ConsoleOutputStrategy()),
            Arguments.of(new StreamPrimeGenerator(), new FileOutputStrategy("primos_stream.txt"))
        );
    }

    @ParameterizedTest(name = "{index} ⇒ {0} con {1}")
    @MethodSource("generatorAndOutputProvider")
    @DisplayName("Primer número primo")
    public void firstPrime(PrimeGenerator generator, OutputStrategy outputStrategy) {
        PrimeUtils primeUtils = new PrimeUtils(generator, outputStrategy);
        primeUtils.printFirstNPrimes(1);
    }

    @ParameterizedTest(name = "{index} ⇒ {0} con {1}")
    @MethodSource("generatorAndOutputProvider")
    @DisplayName("Primeros cuatro primos")
    public void firstFourPrimes(PrimeGenerator generator, OutputStrategy outputStrategy) {
        PrimeUtils primeUtils = new PrimeUtils(generator, outputStrategy);
        primeUtils.printFirstNPrimes(4);
    }

    @ParameterizedTest(name = "{index} ⇒ {0} con {1}")
    @MethodSource("generatorAndOutputProvider")
    @DisplayName("Error con número negativo")
    public void printNegativeNumberOfPrimes(PrimeGenerator generator, OutputStrategy outputStrategy) {
        PrimeUtils primeUtils = new PrimeUtils(generator, outputStrategy);
        assertThrows(IllegalArgumentException.class, () -> primeUtils.printFirstNPrimes(-2));
    }

    @ParameterizedTest(name = "{index} ⇒ {0} con {1}")
    @MethodSource("generatorAndOutputProvider")
    @DisplayName("Sin primos (n = 0)")
    public void printNoPrime(PrimeGenerator generator, OutputStrategy outputStrategy) {
        PrimeUtils primeUtils = new PrimeUtils(generator, outputStrategy);
        primeUtils.printFirstNPrimes(0);
    }
}
