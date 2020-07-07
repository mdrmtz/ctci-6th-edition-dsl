package mx.bluetouch.ctci.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrieNodeTest {
    @Test
    public void testConstructor() {
        TrieNode trieNode = new TrieNode();
        assertEquals(false, trieNode.terminates());

        trieNode = new TrieNode('t');
        assertEquals('t', trieNode.getChar());
    }
}