package in.starhealth.override_example;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    public static void main(String[] args) {

        Vehicle v = new Car();
        v.start();
    }
}
