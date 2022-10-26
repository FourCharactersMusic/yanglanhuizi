package com.basic.java.lianayang.impl;

import com.basic.java.lianayang.Fruits;
import com.basic.java.lianayang.factory.SimpleFruitFactory;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author YangLanhuizi
 * @date 2022/10/26 - 1:21 PM
 */
public class SupermarketSingleton {

    //单例模式：创建超市对象
    private SupermarketSingleton() {
    }

    //懒汉式,静态内部类实现
    private static class SupermarketSingletonHolder {
        private static final SupermarketSingleton INSTANCE = new SupermarketSingleton();
    }

    public static SupermarketSingleton getInstance() {
        return SupermarketSingletonHolder.INSTANCE;
    }

    //超市进货水果
    public void stockFruit(String name, String price) {
        SimpleFruitFactory.createFruit(name).setPrice(price);
    }

    //超市设置水果折扣
    public void setFruitDiscount(String name, String discount) {
        BigDecimal result;
        Fruits fruit;
        fruit = SimpleFruitFactory.createFruit(name);

        //计算打折后水果的价格
        BigDecimal fruitPrice = new BigDecimal(fruit.getPrice());
        BigDecimal disPrice = new BigDecimal(discount);
        result = fruitPrice.multiply(disPrice);

        //将原水果价格调整为折后水果价格
        fruit.setPrice(result.toString());
    }

    //超市设置总价折扣
    public String setTotalDiscount(String totalPrice) {
        BigDecimal result;
        BigDecimal startPrice = new BigDecimal(totalPrice);
        BigDecimal boundPrice = new BigDecimal(100);
        BigDecimal disPrice = new BigDecimal(10);

        //当总价大于100时可减10元
        if (startPrice.compareTo(boundPrice) == 1) {
            result = startPrice.subtract(disPrice);
        }else{
            result = startPrice;
        }
        return result.toString();
    }

    //超市结算商品总价
    public String getTotalPrice(ArrayList<String> list) {
        BigDecimal eachPrice;
        BigDecimal res = new BigDecimal(list.get(0));

        //将每种商品价值相加
        for (int i = 1; i < list.size(); i++) {
            eachPrice = new BigDecimal(list.get(i));
            res = res.add(eachPrice);
        }
        return res.toString();
    }
}
