package com.basic.java.lianayang.factory;

import com.basic.java.lianayang.Fruits;
import com.basic.java.lianayang.impl.AppleSingleton;
import com.basic.java.lianayang.impl.MangoSingleton;
import com.basic.java.lianayang.impl.StrawberrySingleton;

/**
 * @author YangLanhuizi
 * @date 2022/10/26 - 4:07 PM
 */
public class SimpleFruitFactory {

    public static Fruits createFruit(String name) {
        Fruits fruit;
        if ("apple".equals(name)) {
            fruit = AppleSingleton.getInstance();
        } else if ("strawberry".equals(name)) {
            fruit = StrawberrySingleton.getInstance();
        } else if ("mango".equals(name)) {
            fruit = MangoSingleton.getInstance();
        } else {
            throw new RuntimeException("不存在当前水果类型");
        }
        return fruit;
    }
}
