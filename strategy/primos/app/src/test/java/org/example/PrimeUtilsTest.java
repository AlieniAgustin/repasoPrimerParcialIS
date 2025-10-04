package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

public class PrimeUtilsTest {

    //metodo que provee los generadores posibles
    static Stream<PrimeGenerator> primeGeneratorProvider() {
        return Stream.of(
            new RecursivePrimeGenerator(),
            new IterativePrimeGenerator()
        );
    }

    @ParameterizedTest
    @MethodSource("primeGeneratorProvider")
    public void firstPrime(PrimeGenerator generator) {
        PrimeUtils primeUtils = new PrimeUtils(generator);
        primeUtils.printFirstNPrimes(1);
    }

    @ParameterizedTest
    @MethodSource("primeGeneratorProvider")
    public void firstFourPrimes(PrimeGenerator generator) {
        PrimeUtils primeUtils = new PrimeUtils(generator);
        primeUtils.printFirstNPrimes(4);
    }

    @ParameterizedTest
    @MethodSource("primeGeneratorProvider")
    public void printNegativeNumberOfPrimes(PrimeGenerator generator) {
        PrimeUtils primeUtils = new PrimeUtils(generator);
        assertThrows(IllegalArgumentException.class, () -> primeUtils.printFirstNPrimes(-2));
    }

    @ParameterizedTest
    @MethodSource("primeGeneratorProvider")
    public void printNoPrime(PrimeGenerator generator) {
        PrimeUtils primeUtils = new PrimeUtils(generator);
        primeUtils.printFirstNPrimes(0);
    }
}
