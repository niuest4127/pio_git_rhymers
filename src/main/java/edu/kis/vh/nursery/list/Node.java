package edu.kis.vh.nursery.list;

public class Node {
    
    private final int value;
    private Node prev;
    private Node next;
    
    public Node(final int i) {
        value = i;
        prev = null;
        next = null;
    }
    
    public int getValue() {
        return value;
    }
    
    public Node getPrev() {
        return prev;
    }
    
    public void setPrev(final Node prev) {
        this.prev = prev;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(final Node next) {
        this.next = next;
    }
}
