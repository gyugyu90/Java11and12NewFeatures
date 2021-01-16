package chap1;

public class InterfaceTypeInference {
    interface MarathonRunner {
        default void run() {
            System.out.println("I'm a marathon runner");
        }
    }

    static class Child implements MarathonRunner {
        void whistle() {
            System.out.println("Child Whistle");
        }

        void stand() {
            System.out.println("Child Stand");
        }
    }

    public static void main(String[] args) {
        var obj = new Child();

        obj.whistle();
        obj.stand();
        obj.run();
    }
}
