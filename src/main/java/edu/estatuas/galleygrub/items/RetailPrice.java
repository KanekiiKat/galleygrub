package edu.estatuas.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class RetailPrice {

    static final HashMap<String, Double> prices = new HashMap<>();

    private RetailPrice(){}


    public static void init_prices(){

        prices.put("cheese", 0.25d);
        prices.put("sauce", 0.50d);
        prices.put("medium", 0.25d);
        prices.put("large", 0.50d);

    }
    
    
    public static void display(){
        for (Map.Entry<String, Double> food : prices.entrySet()){
            System.out.println("\t" + food.getKey() + "=" + food.getValue());
        }
    }

     static double getPrice(String item) {
        if (prices.get(item) == null){
            return 0.0;
        } else {
            return prices.get(item);
        }
        
    }  


}
