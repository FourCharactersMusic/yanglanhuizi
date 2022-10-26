package com.basic.java.lianayang.impl;

import com.basic.java.lianayang.Fruits;

/**
 * @author YangLanhuizi
 * @date 2022/10/26 - 12:20 PM
 */
public class StrawberrySingleton extends Fruits {
    private String price;
    
    private StrawberrySingleton(){}

    private static class StrawberrySingletonHolder{
        private static final StrawberrySingleton STRAWBERRY = new StrawberrySingleton();
    }

    public static StrawberrySingleton getInstance(){
        return StrawberrySingletonHolder.STRAWBERRY;
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
