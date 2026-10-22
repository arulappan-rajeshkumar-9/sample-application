package in.starhealth.java8.feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionInterfaceConsumer {

    public static void main(String[] args) {

        Consumer<List<Integer>> consumer = list -> {

            for(int i=0; i<list.size(); i++) {

                list.set(i, 2*list.get(i));
            }
        };

        Consumer<List<Integer>> consumerInteger = list -> {

            for(Integer i : list) {

                System.out.println(" " +i);
            }
        };

        consumer.andThen(consumerInteger).accept(Arrays.asList(1, 2, 3));
    }
}
