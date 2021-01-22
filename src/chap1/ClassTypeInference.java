package chap1;

public class ClassTypeInference {

    public static void main(String[] args) {
        var obj = new Child();
        obj.whistle();
        obj.stand(); // type of obj inferred as Child

        var obj2 = getObject("Child");
        obj2.whistle();
        // obj2.stand(); // This line doesn't compile

        var car = (Automobile) new Car();
        // car.check(); // won't compile.

        var name = (String) null; // code compiles
    }

    static Parent getObject(String type) {
        if (type.equals("Parent")) {
            return new Parent();
        } else {
            return new Child();
        }
    }

    static class Parent {
        void whistle() {
            System.out.println("Parent Whistle");
        }
    }

    static class Child extends Parent {
        void whistle() {
            System.out.println("Child Whistle");
        }

        void stand() {
            System.out.println("Child Stand");
        }
    }

    static class Automobile {}

    static class Car extends Automobile {
        void check() {}
    }

}
