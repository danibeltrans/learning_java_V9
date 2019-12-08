package example.javamodularity.Optional;

import example.javamodularity.Book;

import java.util.List;
import java.util.Optional;

public class OptionalOr {


    public static void main (String ... str){

        Optional<Book> book = Optional.of(Book.getBook());

        Book beforeBook = getBestOffer()
                .orElse(getExternalOffer().orElse(book.get()));


        Optional<Book> bestBook = getBestOffer()
                .or(() -> getExternalOffer())
                .or(() -> book);

        System.out.println(bestBook);

        //Use get method on the last optional


    }

    static Optional<Book> getBestOffer(){
        return Optional.empty();
    }

    static Optional<Book> getExternalOffer(){
        return Optional.of(new Book("External Book", List.of("author2"), 11.99));
    }
}
