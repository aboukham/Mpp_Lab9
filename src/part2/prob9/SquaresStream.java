package part2.prob9;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquaresStream {
    final static Function<Integer, Stream<Integer>> squares = x -> Stream.iterate(1, n -> (n + 1)).limit(x).map(n -> n * n);
    public static void printNFirstSquare(int n){
        System.out.println(squares.apply(n).collect(Collectors.toList()));
    }
    public static void main(String[] args){
        printNFirstSquare(10);
        System.out.println("=============================");
        printNFirstSquare(5);
    }
}
