package com.utan;

import javax.swing.*;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * 枚举
 */
public enum Season2 implements SeasonInterface{
    SPRING{
        @Override
        public void show() {
            System.out.println("这是春天");
        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("这是夏天");
        }
    },
    AUTUMN{
        @Override
        public void show() {
            System.out.println("这是秋天");
        }
    },
    WINTER{
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };
}
