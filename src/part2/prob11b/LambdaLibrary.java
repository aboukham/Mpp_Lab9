package lab9.part2.prob11b;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public final static Function<List<Employee>, String> NAMES_OF_EMPLOYEES = list ->
            list.stream()
                    .filter(e -> e.getSalary() > 100000)
                    .filter(e -> e.getLastName().charAt(0) > 'M' && e.getLastName().charAt(0) <= 'Z')
                    .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
                    .map(e -> e.getFirstName() + " " + e.getLastName())
                    .collect(Collectors.joining(", "));
}
