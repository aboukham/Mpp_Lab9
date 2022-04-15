package part1.prob4;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeStream {
    private final Function<Integer, Stream<Integer>> primes = x -> Stream.iterate(2, PrimeStream :: nextPrime).limit(x);

    public static boolean isPrime(int n){
        return (n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0));
    }

    public static int nextPrime(int lastPrime){
        int count = lastPrime + 1;
        for (; !isPrime(count); count++);
        return count;
    }

    public void printNFirstPrimes(int n){
        System.out.println(primes.apply(n).collect(Collectors.toList()));
    }

    public static void main(String[] args){
       PrimeStream ps = new PrimeStream();
       ps.printNFirstPrimes(10);
       System.out.println("==============================");
       ps.printNFirstPrimes(5);

    }
}
