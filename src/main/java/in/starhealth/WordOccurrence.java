package in.starhealth;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurrence {

    public static void main(String[] args) {

        String str = "This is a test. This test is only a test.";
        String[] words = str.split("\\W+");
        Map<String, Long> map = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Map : " + map);
    }
}
