package com.basic.java.lianayang.impl;

import com.basic.java.lianayang.Fruits;

/**
 * @author YangLanhuizi
 * @date 2022/10/26 - 12:20 PM
 */
public class AppleSingleton extends Fruits {
    private String price;

    private AppleSingleton(){}

    private static class AppleSingletonHolder{
        private static final AppleSingleton APPLE = new AppleSingleton();
    }

    public static AppleSingleton getInstance(){
        return AppleSingletonHolder.APPLE;
    }

    @Override
    public String getPrice() {
        return price;
    }
    @Override
    public void setPrice(String price) {
        this.price = price;
    }

}
