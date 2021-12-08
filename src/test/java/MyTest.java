import com.sun.source.tree.BreakTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void correctValue() {
        assertEquals("codewa.rs", Kata.name);
    }


    private static class Kata {
        public static String name = "codewa.rs";
        }
    }


