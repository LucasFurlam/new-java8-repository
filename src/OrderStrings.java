import java.util.ArrayList;
import java.util.List;

public class OrderStrings {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("alura online");
        words.add("editora casa do codigo");
        words.add("caelum");

//        Without using default methods
//        Collections.sort(words, comparator);

//      Using the default methods and lambda of Java 8
        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(words);

//        Without using default methods and lambda
//        for (String w: words) {
//            System.out.println(w);
//        }
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };

//      Using the default methods and lambda of Java 8
        words.forEach(s -> System.out.println(s));
    }

}

