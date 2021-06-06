package com.utan;

import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.util.*;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestSet {
    //main方法，程序入口
    public static void main(String[] args) {
        Student s = new Student("12");
        Student s2 = new Student("13");
        Student s3 = new Student("14");
        Student s4 = new Student("42");
        Student s5 = s;
        //无序唯一  哈希表(数组加链表)
        HashSet<Student> set = new HashSet<>();
        set.add(s);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        System.out.println(set);
        System.out.println(set.size());

        //LinkedHashSet有序唯一  总的链表记录了插入的顺序所以才按照插入顺序排序
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(8);
        linkedHashSet.add(4);
        linkedHashSet.add(2);
        linkedHashSet.add(5);
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet);

        //TreeSet 升序唯一 二叉树  比较的对象必须实现内部比较器或者外部比较器x
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(9);
        treeSet.add(15);
        treeSet.add(63);
        treeSet.add(28);
        treeSet.add(9);
        System.out.println(treeSet);
        System.out.println(treeSet.size());

        //TreeSet(二叉树,升序排列(二叉树的中序排列))必须实现外部比较器,内部比较器
        /*Comparator<User> com = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        };*/
        //匿名内部类
        TreeSet<User> treeSet2 = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        treeSet2.add(new User("lili",13));
        treeSet2.add(new User("nana",15));
        treeSet2.add(new User("jiajia",17));
        treeSet2.add(new User("bnana",15));
        treeSet2.add(new User("haohao",23));
        System.out.println(treeSet2);

    }
}
