package lab9.part2.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Stream<Integer> myIntStream = Stream.of(10, 20, -5, -15, 5, -30);
        IntSummaryStatistics    summary = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("The minimum number in the stream is: " + summary.getMin());
        System.out.println("The maximum number in the stream is: " + summary.getMax());
    }
}
