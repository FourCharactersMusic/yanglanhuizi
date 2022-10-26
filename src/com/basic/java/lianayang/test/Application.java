package com.basic.java.lianayang.test;

import com.basic.java.lianayang.impl.Customer;
import com.basic.java.lianayang.impl.SupermarketSingleton;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        SupermarketSingleton supermarket = SupermarketSingleton.getInstance();
        //超市出售苹果、草莓，苹果每斤8元，草莓每斤13元
        supermarket.stockFruit("apple","8");
        supermarket.stockFruit("strawberry","13");
        
        //1.顾客A购苹果13斤，草莓14斤
        Customer cus1 = new Customer("A");

        ArrayList<String> cusList1 = new ArrayList<>();
        cusList1.add(cus1.buy("apple","13"));
        cusList1.add(cus1.buy("strawberry","14"));

        //1.结果：顾客A购买的商品总价
        System.out.println("顾客A购买总价为: "+ supermarket.getTotalPrice(cusList1));

        //超市新增出售芒果，芒果每斤20元
        supermarket.stockFruit("mango","20");


        //2.顾客B购买苹果15斤，草莓16斤，芒果17斤
        Customer cus2 = new Customer("B");

        ArrayList<String> cusList2 = new ArrayList<>();
        cusList2.add(cus2.buy("apple","15"));
        cusList2.add(cus2.buy("strawberry","16"));
        cusList2.add(cus2.buy("mango","17"));

        //2.结果：顾客B购买的商品总价
        System.out.println("顾客B购买总价为: "+ supermarket.getTotalPrice(cusList2));

        //超市限时促销活动，草莓打8折，草莓每斤6.4元
        supermarket.setFruitDiscount("strawberry","0.8");

        //3.顾客C购买苹果15斤，草莓16斤，芒果17斤
        Customer cus3 = new Customer("C");
        ArrayList<String> cusList3 = new ArrayList<>();
        cusList3.add(cus3.buy("apple","15"));
        cusList3.add(cus3.buy("strawberry","16"));
        cusList3.add(cus3.buy("mango","17"));

        //3.结果：顾客C购买的商品总价
        System.out.println("顾客C购买总价为: "+ supermarket.getTotalPrice(cusList3));


        //4.顾客D购买购买苹果15斤，草莓16斤，芒果17斤，超市满100减10
        Customer cus4 = new Customer("D");
        ArrayList<String> cusList4 = new ArrayList<>();
        cusList4.add(cus4.buy("apple","15"));
        cusList4.add(cus4.buy("strawberry","16"));
        cusList4.add(cus4.buy("mango","17"));

        //超市加大促销力度，购物满100减10元
        String totalPrice = supermarket.getTotalPrice(cusList4) ;

        //4.结果：顾客D购买的商品总价
        System.out.println("顾客D购买总价为: "+ supermarket.setTotalDiscount(totalPrice));
    }
}
