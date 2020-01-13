import static java.lang.String.valueOf;

public class GameNumber {
    private int num;

    public GameNumber(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        String s = valueOf(num);
        if (isdivisible(3)) {
            s = "fizz";
        }
        if (isdivisible(5)) {
            s = "buzz";
        }
        if (isdivisible(5) && isdivisible(3)) {
            s = "fizzbuzz";
        }
        return s;
    }

    private boolean isdivisible(int i) {
        return num % i == 0;
    }
}
