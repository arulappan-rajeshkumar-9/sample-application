package in.starhealth.java8.feature;

import java.util.function.Function;

public class FunctionInterfaceIdentity {

    public static void main(String[] args) {

        Function<Integer, Integer> function = Function.identity();
        System.out.println(function.apply(10));
    }
}
