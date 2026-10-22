package in.starhealth.java8.feature;

import java.util.function.Function;

public class FunctionalInterfaceFunction {

    public static void main(String[] args) {

        Function<Integer,Double> function =  i -> i/5.0;

        System.out.println(function.apply(10));

        function = function.andThen(i -> 2*i);

        System.out.println(function.apply(10));
    }
}
