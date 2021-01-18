package chap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TypeInferenceWithGenerics {


    public static void main(String[] args) {
        var names = new ArrayList<>();
        names.add(1);
        names.add("Mala");
        names.add(10.9);
        names.add(true);

        var properUsage = new ArrayList<String>();

        var penList = new ArrayList<Pen>();

        var pen1 = new Pen("Lateral", 219.9);
        var pen2 = new Pen("Pinker", 19.9);
        var pen3 = new Pen("Simplie", 159.9);

        penList.add(pen1);
        penList.add(pen2);
        penList.add(pen3);

        Collections.sort(penList);

        for (var pen : penList) {
            System.out.println(pen);
        }

    }

    static class Pen implements Comparable<Pen> {
        String name;
        double price;

        public Pen(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public int compareTo(Pen o) {
            return ((int)(this.price - o.price));
        }

        @Override
        public String toString() {
            return "Pen{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }

}
