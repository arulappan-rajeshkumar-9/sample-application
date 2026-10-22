package in.starhealth.java8.feature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        BiConsumer<List<Integer>, List<Integer>> biConsumer1 = (lst1, lst2) -> {

            if(lst1.size() != lst2.size()) {

                System.out.println("False");
            } else {

                for(int i=0; i<lst1.size(); i++) {

                    if(lst1.get(i) != lst2.get(i)) {

                        System.out.println("False");
                        return;
                    } else {

                        System.out.println("True");
                    }
                }
            }
        };

        BiConsumer<List<Integer>, List<Integer>> biConsumer2 = (integerList1, integerList2) -> {

            integerList1.stream().forEach(a -> System.out.print(" "+ a));
            System.out.println();
            integerList2.stream().forEach(a -> System.out.print(" "+ a));
            System.out.println();
        };

        biConsumer2.andThen(biConsumer1).accept(list1, list2);
    }
}
