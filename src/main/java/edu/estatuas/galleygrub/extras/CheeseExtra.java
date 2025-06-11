package edu.estatuas.galleygrub.extras;
import edu.estatuas.galleygrub.items.Item;
import edu.estatuas.galleygrub.order.Comanda;

public class CheeseExtra extends Extra {
    
    private final double CHEESE_PRICE = 0.25;

    public CheeseExtra() {
    }


    @Override
    public void sumExtras(Comanda order){
        for (Item item : order.itemList()){
            if (!item.isRegular() && item.extra().equals("cheese")){
                order.updateTotal(CHEESE_PRICE);
            }
        }
        
    }

    

}
