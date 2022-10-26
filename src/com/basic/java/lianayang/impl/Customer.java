package com.basic.java.lianayang.impl;

import com.basic.java.lianayang.factory.SimpleFruitFactory;
import com.basic.java.lianayang.util.NumberUtil;

import java.math.BigDecimal;

/**
 * @author YangLanhuizi
 * @date 2022/10/26 - 12:09 PM
 */
public class Customer {
    private String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String buy(String fruit,String quantity){
        BigDecimal result;
        BigDecimal num = new BigDecimal(quantity);

        //水果斤数为大于等于0的整数
        if(NumberUtil.isNonNegativeInteger(quantity)) {
            //计算每种水果的总价
            BigDecimal fruitPrice = new BigDecimal(SimpleFruitFactory.createFruit(fruit).getPrice());
            result = fruitPrice.multiply(num);
            return result.toString();
        }else{
            throw new RuntimeException("水果斤数要为大于等于0的整数");
        }
    }
}
