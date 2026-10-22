package in.starhealth.java8.feature;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    public static void main(String[] args) {

        Predicate<Integer> lessThan0 = i -> i > 0;
        Predicate<Integer> greaterThan100 = i -> i < 100;

        System.out.println(lessThan0.test(25));

        System.out.println(lessThan0.and(greaterThan100).test(25));

        System.out.println(lessThan0.or(greaterThan100).test(25));

        System.out.println(lessThan0.negate().test(-25));

        Predicate<String> predicate = Predicate.isEqual("Java");
        System.out.println("Predicate is Equals :" + predicate.test("Java1"));
    }
}
