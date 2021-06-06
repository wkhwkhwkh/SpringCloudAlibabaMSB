package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class MyLinkedList {
    private Node first;

    private Node last;

    private int count;

    public void add(Object o){
        if(null == first){
            Node node = new Node();
            node.setPre(null);
            node.setObject(o);
            node.setNext(null);
            first = node;
            last = node;//添加了一个元素就需要将这个节点作为最后一个元素
        }else{
            Node node = new Node();
            node.setPre(last);//n的上一个节点一定是链的最后一个节点
            node.setObject(o);
            node.setNext(null);
            last.setNext(node);
            last = node;
        }
        count++;
    }

    public int size(){
        return count;
    }

    public Object get(int index) {
        if(index >= count){
            throw new RuntimeException("无索引为:"+index);
        }
        Node n = first;
        for(int i = 0; i < index; i++){
            n = n.getNext();
        }
        return n.getObject();
    }

    //main方法，程序入口
    public static void main(String[] args) throws Exception{
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("abc");
        myLinkedList.add("fadf");
        myLinkedList.add("ddad");
        myLinkedList.add("fsdf");
        myLinkedList.add("ddgsad");
        myLinkedList.add("ddafsdfdd");
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(3));
    }
}
