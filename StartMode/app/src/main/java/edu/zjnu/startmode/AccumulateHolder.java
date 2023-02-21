package edu.zjnu.startmode;

/**
 * @author: 杨海波
 * @date: 2023-02-21 09:12:58
 * @description: AccumulateHolder
 */
public class AccumulateHolder {

    private static volatile int value;

    public static synchronized void accumulate() {
        value++;
    }

    public static synchronized int getValue() {
        return value;
    }

    public static synchronized void setValue(int value) {
        AccumulateHolder.value = value;
    }
}
