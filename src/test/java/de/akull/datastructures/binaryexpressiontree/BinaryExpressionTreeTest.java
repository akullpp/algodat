package de.akull.datastructures.binaryexpressiontree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class BinaryExpressionTreeTest {

    private Node conjunction() {
        return new And(new Equal("a", "1"), new Equal("b", "2"));
    }

    @Test
    public void Should_Evaluate_Conjunctions() {
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "1");
        data.put("b", "2");

        boolean result = conjunction().eval(data);

        assertThat(result).isTrue();
    }

    @Test
    public void Should_Evaluate_Incomplete_Conjunctions_As_False() {
        Node tree = new And(new Equal("a", "1"), new Equal("b", "2"));
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "1");

        boolean result = conjunction().eval(data);

        assertThat(result).isFalse();
    }

    @Test
    public void Should_Evaluate_Non_Matching_Conjunctions_As_False() {
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "1");
        data.put("b", "3");

        boolean result = conjunction().eval(data);

        assertThat(result).isFalse();
    }
}
