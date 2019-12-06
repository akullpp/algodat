package de.akull.datastructures.binaryexpressiontree;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import org.junit.jupiter.api.Test;


public class BinaryExpressionTreeTest {

    @Test
    public void Should_Evaluate_Conjunctions() {
        Node conjunction = new And(new Equal("a", "1"), new Equal("b", "2"));
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "1");
        data.put("b", "2");

        boolean result = conjunction.eval(data);

        assertThat(result).isTrue();
    }

    @Test
    public void Should_Evaluate_Invalid_Conjunctions_As_False() {
        Node conjunction = new And(new Equal("a", "1"), new Equal("b", "2"));
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "2");
        data.put("a", "2");

        boolean result = conjunction.eval(data);

        assertThat(result).isFalse();
    }

    @Test
    public void Should_Evaluate_Disjunctions() {
        Node disjunction = new Or(new Equal("a", "1"), new Equal("b", "2"));
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "1");
        data.put("b", "3");

        boolean result = disjunction.eval(data);

        assertThat(result).isTrue();
    }

    @Test
    public void Should_Evaluate_Invalid_Disjunctions_As_False() {
        Node disjunction = new Or(new Equal("a", "1"), new Equal("b", "2"));
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "2");
        data.put("b", "1");

        boolean result = disjunction.eval(data);

        assertThat(result).isFalse();
    }

    @Test
    public void Should_Evaluate_Equal() {
        Node equal = new Equal("a", "1");
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "1");

        boolean result = equal.eval(data);

        assertThat(result).isTrue();
    }

    @Test
    public void Should_Evaluate_Non_Matching_Equal_As_False() {
        Node equal = new Equal("a", "1");
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "2");

        boolean result = equal.eval(data);

        assertThat(result).isFalse();
    }

    @Test
    public void Should_Evaluate_Not() {
        Node equal = new Not(new Equal("a", "1"));
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "2");

        boolean result = equal.eval(data);

        assertThat(result).isTrue();
    }

    @Test
    public void Should_Evaluate_Non_Matching_Not_As_False() {
        Node equal = new Not(new Equal("a", "1"));
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "1");

        boolean result = equal.eval(data);

        assertThat(result).isFalse();
    }
}
