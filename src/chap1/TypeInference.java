package chap1;

import java.time.LocalDateTime;

public class TypeInference {
    public static void main(String[] args) {
        var name = "Java Everywhere"; // inferred as String
        var dateTime = LocalDateTime.now(); // inferred as LocalDateTime

        var age = 9;
        // age = 10.9; // can't assign 10.9 to variable of type int

        var query = new StringBuilder("SELECT"); // infer type as StringBuilder
        // query = query.toString() + "FROM" + "TABLE"; // won't compile

        byte age2 = 29; // no type inference
        var age3 = (byte) 29; // explicit type casting

        var letter = (char) 97;
        var debit = (float) 17.9;

    }
}
