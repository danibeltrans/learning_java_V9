package example.javamodularity.Optional;

import java.util.Optional;

public class OptionalIsPresent {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.of("D");

        //stringOptional = Optional.empty();

        //Before
        stringOptional.ifPresent(System.out::println);

        //Now
        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Nothing here"));

    }
}
