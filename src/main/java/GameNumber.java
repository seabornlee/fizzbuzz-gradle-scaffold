import static java.lang.String.valueOf;

public class GameNumber {
    private int num;

    public GameNumber(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        String s = valueOf(num);
        if (isdivicible(3)) {
            s = "fizz";
        }
        if (isdivicible(5)) {
            s = "buzz";
        }
        if (isdivicible(5) && isdivicible(3)) {
            s = "fizzbuzz";
        }
        return s;
    }

    private boolean isdivicible(int i) {
        return num % i == 0;
    }
}
