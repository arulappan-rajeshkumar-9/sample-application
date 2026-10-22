package in.starhealth.java8.feature;

import java.util.Arrays;

public class MethodReferencesExample {

    private static void print(String str) {

        System.out.println(str);
    }

    public static void main(String[] args) {

        String[] strArray = {"Rajesh", "Kumar", "Chennai", "Gingee"};

        Arrays.stream(strArray).forEach(System.out::println);

        Arrays.stream(strArray).forEach(MethodReferencesExample::print);
    }
}
