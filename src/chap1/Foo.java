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

        // var counter = 9_009_998_992_887; // code doesn't compile
        var counter = 9_009_998_992_887L; // code compiles

        var aChar = (char) 91;

        var divResult = 5/2; // inferred as int 2
        var divResult2 = (double) (5/2); // 2.0
        System.out.println(divResult2);

        var divResult3 = (double) 5 / 2; // 2.5
        System.out.println(divResult3);

        byte b1 = 10;
        char c1 = 0;

        var sum = b1 + c1; // inferred as int

        byte cupsOfCoffee = 10;
        long population = 10L;
        float weight = 79.8f;
        double distance = 198654.77;

        var total1 = cupsOfCoffee + population; // long
        var total2 = distance + population; // double
        var total3 = weight + population; // float


    }


}
