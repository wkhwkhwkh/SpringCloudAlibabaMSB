package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Node {

    private Node pre;

    private Object object;

    private Node next;

    public Node() {
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", object=" + object +
                ", next=" + next +
                '}';
    }
}
