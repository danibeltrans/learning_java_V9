package example.javamodularity;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CollectionExamples {

    public static void main(String ... str){

        List<Integer> ints = List.of(1,2,3);

        //Validate inmutablility
        ints.add(4);

        //New inmutableCollection:
        ints.getClass();

        //Validate 2 types List1, ListN
        List.of(1).getClass();


         Set.of("first", "second");

         // Null pointer because is prohibited
         Set.of(null);

         Map.of("Key1", 1, "Key2", 2);

         List<Integer> ints2 = Stream.of(1,2,3)
                 .map(n -> n + 1)
                 .collect(Collectors.toList());

         //New parameter

         Map<Integer, List<Integer>> ints3 =
                 Stream.of(1,2,3,3,4)
                         .collect(groupingBy(i -> i %2 , toList()));

         System.out.println(ints3);

        Map<String, List<Integer>> ints4 =
                Stream.of(1,2,3,3,4)
                        .collect(groupingBy(i -> i.toString() , filtering( i -> i > 2,toList())));

        System.out.println(ints4);


        Map<Double, Set<String>> authorSellingForPrice =
                Book.getBooks().stream()
                        .collect(groupingBy(Book::getPrice, flatMapping(b -> b.getAuthors().stream(), toSet())));

        System.out.println(authorSellingForPrice);




        // ---- Collection factory methods
        Set<Integer> integers = Set.of(1, 2, 3);
        List<String> strings = List.of("first", "second");
        System.out.println(integers);

        // Exception
        // ints.add(1);
        // ints.clear();

        // ---- Stream API improvements

        IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);

        // dropWhile, takeWhile, ofNullable
        //List<String> names = List.of("Smith", "Mark", "Julie", "Niki", "Sofia", "William", "Kevin", "Michel");

        List<String> names = List.of("Mark", "Michel", "Smith", "Julie", "Niki", "Sofia", "William", "Kevin");

        names.stream().dropWhile(s -> s.startsWith("M"))
                .forEach(System.out::println);

        System.out.println("  ------  ");

        names.stream().takeWhile(s -> s.startsWith("M"))
                .forEach(System.out::println);


        // nondeterministic
        Set<Integer> numbers = Set.of(2, 4, 6, 3, 8);
        numbers.stream()
                .takeWhile(n -> n % 2 == 0)
                .forEach(System.out::println);

        // More info https://blog.indrek.io/articles/whats-new-in-java-9-streams/



    }


}
