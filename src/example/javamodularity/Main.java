package example.javamodularity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println("  ------ Optional  ");
        List l = null;
        Stream<Integer> s = Optional.ofNullable(l).orElseGet(() ->List.of(1,2,3)).stream();
        s.forEach(System.out::println);



        // ----- Private interface methods


        /*HttpClient client = HttpClient.newHttpClient();

        HttpRequest req =
                HttpRequest.newBuilder(URI.create("https://www.wordreference.com/es/translation.asp?tranword=caveat"))
                        .header("User-Agent","Java")
                        .GET()
                        .build();


        try {
            HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandler.asString());
            System.out.println(resp.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


    }
}
