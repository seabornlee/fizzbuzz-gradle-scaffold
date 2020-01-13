import static java.lang.String.valueOf;

public class GameNumber {
    private final int num;

    @Override
    public String toString() {
        String s = valueOf(num);
        if (isdivicible(3)) {
            s = "fizz";
        }
        if (isdivicible(5)) {
            s = "buzz";
        }
        if (isdivicible(3) && isdivicible(5)) {
            s = "fizzbuzz";
        }
        return s;
    }

    private boolean isdivicible(int i) {
        return num % i == 0;
    }

    public GameNumber(int num) {
        this.num = num;
    }
}
