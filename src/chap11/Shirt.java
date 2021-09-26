package chap11;

public class Shirt {
    private int length;

    public int getLength() {
        return length;
    }

    public void setSize(Size size) {
        switch (size) {
            case XS:
                length = 10;
                System.out.println(length);
                break;
            case S:
                length = 12;
                System.out.println(length);
                break;
            case M:
                length = 14;
                System.out.println(length);
            case L:
                length = 16;
                break;
            case XL:
                length = 18;
                System.out.println(length);
                break;
            case XXL:
                length = 20;
                System.out.println(length);
                break;
        }
    }
}
