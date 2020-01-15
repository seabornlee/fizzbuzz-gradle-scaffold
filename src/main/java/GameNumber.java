import static java.lang.String.valueOf;

public class GameNumber {
    private int i;

    @Override
    public String toString() {
        String s = i % 15 == 0 ? "fizzbuzz" : i % 5 == 0 ? "buzz" : i % 3 == 0 ? "fizz" : valueOf(i);
        return s;
    }

    public GameNumber(int i) {
        this.i = i;
    }
}
