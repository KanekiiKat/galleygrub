package edu.estatuas.galleygrub.extras;

import edu.estatuas.galleygrub.items.Item;
import edu.estatuas.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extra {

    private double SIZE_PRICE = 0.50;

    public SizeLargeExtra() {
    }
    
    @Override
    public void sumExtras(Comanda order){
        for (Item item : order.itemList()){
            if (!item.isRegular() && item.extra().equals("large")){
                order.updateTotal(SIZE_PRICE);
                
            }
        }
        
        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }

}
