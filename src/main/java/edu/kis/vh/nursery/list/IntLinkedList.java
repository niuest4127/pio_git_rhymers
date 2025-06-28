package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_VALUE = -1;
    private static final boolean FULL_STATUS = false;

    private Node last;

    public void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            Node newNode = new Node(i);
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return FULL_STATUS;
    }

    public int top() {
        if (isEmpty()) {
            return EMPTY_VALUE;
        }
        return last.getValue();
    }

    public int pop() {
        if (isEmpty()) {
            return EMPTY_VALUE;
        }
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}
