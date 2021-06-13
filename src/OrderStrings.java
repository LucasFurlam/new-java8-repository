import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrderStrings {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("alura online");
        words.add("editora casa do codigo");
        words.add("caelum");

        Comparator<String> comparator = new SizeComparator();

//        Collections.sort(words, comparator);
        words.sort(comparator);

        System.out.println(words);

//        for (String w: words) {
//            System.out.println(w);
//        }

        Consumer<String> consumer = new PrintLine();
        words.forEach(consumer);

    }

}

class PrintLine implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class SizeComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
}
