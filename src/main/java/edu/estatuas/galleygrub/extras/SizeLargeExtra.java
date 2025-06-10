package edu.estatuas.galleygrub.extras;

import edu.estatuas.galleygrub.items.Item;
import edu.estatuas.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extra {

    private double SIZE_PRICE = 0.50;

    public SizeLargeExtra() {
    }
    
    public void sumExtras(Comanda order){
        for (Item item : order.itemList()){
            if (!item.isRegular() && item.name().equals("large")){
                order.updateTotal(SIZE_PRICE);
            }
        }
    }
}
