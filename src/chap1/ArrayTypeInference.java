package chap1;

public class ArrayTypeInference {
    public static void main(String[] args) {
        char name1[] = {'S', 't', 'r', 'i', 'n', 'g'};

        /* won't compile
        var name2[] = {'S', 't', 'r', 'i', 'n', 'g'};
        var[] name3 = {'S', 't', 'r', 'i', 'n', 'g'};
        var name4 = {'S', 't', 'r', 'i', 'n', 'g'};
         */

        var name5 = new char[]{'S', 't', 'r', 'i', 'n', 'g'};
    }
}
