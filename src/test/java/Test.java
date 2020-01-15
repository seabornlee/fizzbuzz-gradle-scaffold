import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Test {
    @org.junit.Test
    public void name() {
        assertThat(new GameNumber(1).toString(), is("1"));
        assertThat(new GameNumber(3).toString(), is("fizz"));
        assertThat(new GameNumber(5).toString(), is("buzz"));
        assertThat(new GameNumber(15).toString(), is("fizzbuzz"));
    }
}
