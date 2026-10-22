package in.starhealth.java8.feature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface {

    public static void main(String[] args) {

        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Hello -> Rajesh");

        Consumer<Integer> consumerInteger = num -> System.out.println(num);
        consumerInteger.accept(100);

        Consumer<List<Integer>> consumerList = list ->{

            for(int i=0; i<list.size(); i++){

                list.set(i, 2* list.get(i));
            }
        };

        Consumer<List<Integer>> listConsumer = list -> list.stream().forEach(a -> System.out.println(" " + a));

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        consumerList.accept(listInteger);
        listConsumer.accept(listInteger);
    }
}
