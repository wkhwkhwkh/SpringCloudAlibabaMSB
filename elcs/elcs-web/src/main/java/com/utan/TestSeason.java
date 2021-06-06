package com.utan;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestSeason {
    //main方法，程序入口
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season);

        Season2 season1 = Season2.SUMMER;
        System.out.println(season1);

        Season2 [] s = Season2.values();
        System.out.println(Arrays.toString(s));

        Season2 season2 = Season2.valueOf("SUMMER");
        System.out.println(season2);

        ArrayList list = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,7));
        System.out.println(list);

        boolean b = list.remove(new Integer(7));
        System.out.println(list.size());
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(0));
        }
       /* List list = new ArrayList();
        list.add(41);
        list.add(41);
        list.add(42);
        list.add(41);
        boolean b = list.remove(new Integer(41));
        System.out.println(list.size());
        System.out.println(list);*/
    }
}
