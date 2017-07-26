package de.akull.ds.tree;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Node<T> {

    private T data;
    private Node left;
    private Node right;
}
