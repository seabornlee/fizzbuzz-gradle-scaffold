import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void test() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
    }
}
