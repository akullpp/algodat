package de.akull.algorithms;

import de.akull.datastructures.graph.Graph;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BreadthFirstSearchTest {

    @Test
    public void Should_Find_Path() {
        Graph graph = Datastructures.graph();

        boolean result = BreadthFirstSearch.hasPath(graph.get(0), graph.get(2));

        assertThat(result).isTrue();
    }

    @Test
    public void Should_Return_False_If_No_Path() {
        Graph graph = Datastructures.graph();

        boolean result = BreadthFirstSearch.hasPath(graph.get(3), graph.get(0));

        assertThat(result).isFalse();
    }
}
