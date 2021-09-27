package chap12;

public enum Size {
    SMALL(36, 19),
    MEDIUM(32, 20) {
        int number = 10;
        int getSize() {
            return length + width;
        }
    },
    LARGE(34, 22) {
        @Override
        public String toText() {
            return "LARGE";
        }
    }
    ;

    int length;
    int width;

    Size(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String toText() {
        return length + " X " + width;
    }
}
