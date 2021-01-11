package chap1;

import java.time.LocalDateTime;

public class TypeInference {
    public static void main(String[] args) {
        var name = "Java Everywhere"; // inferred as String
        var dateTime = LocalDateTime.now(); // inferred as LocalDateTime

    }
}
