package de.akull.datastructures.trie;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrieTest {

    @Test
    public void Should_Find_Stored_Words() {
        Trie trie = new Trie();
        trie.insert("Hello");
        trie.insert("Hell");

        assertThat(trie.isWord("Hello")).isTrue();
        assertThat(trie.isWord("Hell")).isTrue();
        assertThat(trie.isWord("H")).isFalse();
        assertThat(trie.isWord("Hello Hello")).isFalse();
    }
}
