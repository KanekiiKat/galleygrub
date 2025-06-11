package edu.estatuas.galleygrub.extras;

import edu.estatuas.galleygrub.items.Item;
import edu.estatuas.galleygrub.order.Comanda;

public class SauceExtra extends Extra {

    private double SAUCE_PRICE  = 0.50;

    public SauceExtra() {
    }

    @Override
    public void sumExtras(Comanda order){
        for (Item item : order.itemList()){
            if (!item.isRegular() && item.extra().equals("sauce")){
                order.updateTotal(SAUCE_PRICE);

            }
        }
        
    }


    
    
}
