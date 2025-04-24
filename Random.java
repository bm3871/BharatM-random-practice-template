public class Random {

    // generates a random integer from 1 - 10, inclusive of both
    public static int random1To10() {
        int rand = (int)(Math.random() * 10) + 1;
        return rand;
    }

    // generates a random integer from 1 - N, inclusive of both
    public static int random1ToN(int n) {
        int rand = (int)(Math.random() * n) + 1;
        return rand;
    }

    // generates a random integer from x to y, inclusive of both
    public static int randomXtoY(int x, int y) {
        int rand = (int)(Math.random() * (y - x + 1)) + x;
        return rand;
    }

    // helper method used by TestSuite
    public static int getRandom(String type, int x, int y) {
        if (type.equals("1to10")) {
            return random1To10();
        } else if (type.equals("1toN")) {
            return random1ToN(y);
        } else if (type.equals("XtoY")) {
            return randomXtoY(x, y);
        } else {
            System.out.println("Error! Unknown type.");
            return 0;
        }
    }
}