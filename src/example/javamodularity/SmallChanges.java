package example.javamodularity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SmallChanges {

    public static void main (String ... strings) throws IOException {


        // ---- Underscore

        String nomal = "Yes";
        //String _  = "Not";
        // why?  list.forEach( _ -> doSomething())


        // ---- Inference

        //Java 5/6
        ArrayList<String> list5_6 = new ArrayList<String>();

        //Java 7/8
        ArrayList<String> list7_8 = new ArrayList<>();

        //Java 9
        ArrayList<String> list = new ArrayList<>(){
            @Override
            public boolean add (String s){
                return super.add("addd" + s);
            }

        };


        // --- Interfaces

        new Book("Title Book", List.of("Mark"), 12.09 ).getPriceWithTax();


    }

    static void read (FileInputStream fis) throws IOException{

        // ---- Try-catch-resources

        //Before
        try (FileInputStream fis2 = fis) {
             fis2.read();
        }
        
        //Now   - Effective final variables
        try (fis){
            fis.read();

        }

    }
}