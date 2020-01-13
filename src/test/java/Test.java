import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Test {
    @org.junit.Test
    public void fizzbuzz() {
        checkNumber(15, "fizzbuzz");
    }

    @org.junit.Test
    public void buzz() {
        checkNumber(5, "buzz");
    }

    @org.junit.Test
    public void fizz() {
        checkNumber(3, "fizz");
    }

    @org.junit.Test
    public void normal() {
        checkNumber(1, "1");
        checkNumber(2, "2");
    }

    private void checkNumber(int i, String s) {
        assertThat(new GameNumber(i).toString(), is(s));
    }
}
