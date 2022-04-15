package part1.prob4;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PartA {
    public static boolean isPrime(int n){
        return (n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0));
    }

    public static int nextPrime(int lastPrime){
        int count = lastPrime + 1;
        for (; !isPrime(count); count++);
        return count;
    }

    public static void main(String[] args){
        Stream<Integer> stream = Stream.iterate(2, PartA :: nextPrime);
        stream.limit(100).forEach(System.out::println);
    }
}
