import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMessage {
    @Test
    public void test_welcome_message() {
        MessageGenerator obj = new MessageGenerator();
        assertEquals("failure - strings are not equal", "welcome", obj.sayWelcome());
    }
}