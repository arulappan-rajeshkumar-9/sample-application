package in.starhealth.java8.feature;

public class LambdaExpression {

    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition : " + add.calculate(10, 5));
        System.out.println("Subtraction : " + sub.calculate(10, 5));
        System.out.println("Multiplication : " + multiply.calculate(10, 5));
    }
}
