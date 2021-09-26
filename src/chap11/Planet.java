package chap11;

public class Planet {
    private static long damage;

    public void use(SingleUsePlastic plastic) {
        damage += switch (plastic) {
            case STRAW -> 10;
            case BAG -> 11;
            case SPOON, FORK, KNIFE -> 7;
            case PLATE -> 15;
            case BOTTLE -> 20;
        };
    }

}
