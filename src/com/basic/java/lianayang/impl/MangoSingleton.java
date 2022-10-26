package com.basic.java.lianayang.impl;

import com.basic.java.lianayang.Fruits;

/**
 * @author YangLanhuizi
 * @date 2022/10/26 - 12:20 PM
 */
public class MangoSingleton extends Fruits {
    private String price;

    private MangoSingleton(){}

    private static class MangoSingletonHolder{
       private static final MangoSingleton MANGO = new MangoSingleton();
    }

    public static MangoSingleton getInstance(){
        return MangoSingletonHolder.MANGO;
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
