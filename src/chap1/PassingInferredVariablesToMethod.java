package chap1;

public class PassingInferredVariablesToMethod {
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
            System.out.println("Child stand");
        }
    }

    public static void main(String[] args) {
        var aRunner = new Child(); // inferred type is child
        start(aRunner); // ok to pass it as a MarathonRunner type parameter
    }

    private static void start(MarathonRunner runner) {
        runner.run();
    }
}
