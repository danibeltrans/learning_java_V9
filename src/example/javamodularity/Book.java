package example.javamodularity;


import java.util.List;


public class Book implements PricedObject{

    private String name;
    private List<String> authors;
    private Double price;

    public Book(String name, List<String> authors, Double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static List<Book> getBooks (){

        List<Book> books = List.of(new Book("Name1", List.of("author1", "author5"), 10D),
                new Book("Name2", List.of("author2", "author6"), 12D),
                new Book("name3", List.of("author1", "author7"), 20D),
                new Book ("name4", List.of("author2", "author5"), 11D),
                new Book("name4", List.of("author3", "author6"), 10D));

        return books;
    }

    public static Book getBook(){
        return new Book("Name1", List.of("author1", "author5"), 10D);

    }
}
