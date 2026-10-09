package in.starhealth;

import java.util.Arrays;

public class MiddleElement {

    public static void main(String[] args) {

        int[] i = {30, 40, 60, 70, 80, 90};

        int midElement = Arrays.stream(i).skip(i.length/2).findFirst().getAsInt();
        System.out.println("Middle Element : " + midElement);
    }
}
