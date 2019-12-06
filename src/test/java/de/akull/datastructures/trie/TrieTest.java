package de.akull.datastructures.trie;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class TrieTest {

    @Test
    void Should_Find_Stored_Words() {
        Trie trie = new Trie();
        trie.insert("Hello");
        trie.insert("Hell");

        assertThat(trie.isWord("Hello")).isTrue();
        assertThat(trie.isWord("Hell")).isTrue();
        assertThat(trie.isWord("H")).isFalse();
        assertThat(trie.isWord("Hello Hello")).isFalse();
    }
}
