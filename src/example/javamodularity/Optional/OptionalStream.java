package example.javamodularity.Optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalStream {

    public static void main(String[] args) {
        Stream<Optional<Integer>> optionals = Stream.of(Optional.of(1), Optional.empty(), Optional.of(3));

        Stream<Integer> ints5 = optionals.flatMap(Optional :: stream);

        ints5.forEach(System.out::println);
    }
}
