package chap1;

public class Foo {

    public static void main(String[] args) {
        try {
            char[] name = new char[]{'S', 't', 'r', 'i', 'n', 'g'};
            for (var c: name) {
                System.out.println(c + ":" + (c + 1 - 1));
            }
        } catch (RuntimeException ex) { // cannot use var ex
            // code
        }
    }


}
