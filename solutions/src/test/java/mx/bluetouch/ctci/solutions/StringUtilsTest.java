package mx.bluetouch.ctci.solutions;

import mx.bluetouch.ctci.library.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testSplit() {
        LinkedList tokens = StringUtils.split("Hello,      World!");
        assertEquals(2, tokens.size());
    }
}