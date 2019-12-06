package de.akull.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import de.akull.datastructures.graph.Graph;
import org.junit.jupiter.api.Test;

public class DepthFirstSearchTest {

    @Test
    public void Should_Find_Path() {
        Graph graph = Datastructures.graph();

        boolean result = DepthFirstSearch.hasPath(graph.get(0), graph.get(2));

        assertThat(result).isTrue();
    }

    @Test
    public void Should_Return_False_If_No_Path() {
        Graph graph = Datastructures.graph();

        boolean result = DepthFirstSearch.hasPath(graph.get(3), graph.get(0));

        assertThat(result).isFalse();
    }
}
