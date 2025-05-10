package edu.estatuas.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class RetailPrice {

    private HashMap<String, Double> prices = new HashMap<>();

    public RetailPrice(){}


    public void init_prices(){

        prices.putIfAbsent("cheese", 0.25d);
        prices.putIfAbsent("sauce", 0.50d);
        prices.putIfAbsent("medium", 0.50d);
        prices.putIfAbsent("large", 0.50d);

    }
    
    public void display(){
        for (Map.Entry<String, Double> food : prices.entrySet()){
            System.out.println("\t" + food.getKey() + "=" + food.getValue());
        }
    }


}
