package edu.estatuas.galleygrub.extras;

import edu.estatuas.galleygrub.items.Item;
import edu.estatuas.galleygrub.order.Comanda;

public class Regular extends Extra{

    public Regular() {
    }
    
    @Override
    public void sumExtras(Comanda comanda){
        double costRegularItem = 0.0;
        for (Item item : comanda.itemList()){
            if(item.isRegular()){
                costRegularItem += item.price();
            }
        }
        comanda.updateTotal(costRegularItem);
    }
}
