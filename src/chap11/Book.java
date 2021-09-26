package chap11;

public class Book {

    public String getBook(String name) {
        return switch (name) {
            case "Shreya" -> "Harry Potter";
            case "Paul" -> "Management tips";
            case "Harry" -> "Life of Pi";
            default -> "Design Patterns - everyone needs this";
        };
    }

    public String getBookNullable(String name) {
        String bookName = null;
        switch (name) {
            case "Shreya" -> bookName = "Harry Potter";
            case "Paul" -> bookName = "Management tips";
            case "Harry" -> bookName =  "Life of Pi";
        }
        return bookName;
    }

}
