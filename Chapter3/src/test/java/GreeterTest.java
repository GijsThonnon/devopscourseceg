import static org.assertj.core.api.Assertions.*;

public class GreeterTest {

    @org.junit.Test
    public void greet() throws Exception {
        Greeter greeter = new Greeter();
        String actual = greeter.greet("Gijs");
        assertThat(actual.equals("Hello Gijs"));
    }

}