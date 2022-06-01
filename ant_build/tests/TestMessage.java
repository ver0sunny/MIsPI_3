//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//
//public class TestMessage {
//    @Test
//    public void testWelcomeMessage() {
//        MessageGenerator obj = new MessageGenerator();
//        assertEquals("failure - strings are not equal", "wlcome", obj.sayWelcome());
//    }
//}

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestMessage {
    private String name;
    private String expected;
    MessageGenerator msg = new MessageGenerator();

    public TestMessage(String name, String expected) {
        this.name = name;
        this.expected = expected;
    }

//    @Parameterized.Parameters(name = "{index}:notNull({0} != null)")
//    public static Iterable<Object> dataForTestNotNull() {
//        return Arrays.asList("Vanya", null);
//    };
//
//    @Test
//    public void Test() {
//        assertNotNull(msg.sayWelcome(name));
//    }

    @Parameterized.Parameters(name = "{index}:checkEqual(welcome, {0} = {1})")
    public static Iterable<Object[]> dataForTestEquals() {
        return Arrays.asList(new Object[][]{
                {"Ivan", "welcome, Ivan"},
                {"Veronica", "welcome, Veronica"},
                {"Alexey", "welcome, Alexey"},
                {"Ivan", "welcme, Ivan"},
                {"Veronica", "elcome, Vronica"},
                {"Alexey", "welcome, Aleey"},
        });
    }

    @Test
    public void paramTest() {
        assertEquals("failure - strings are not equal", expected, msg.sayWelcome(name));
    }

}