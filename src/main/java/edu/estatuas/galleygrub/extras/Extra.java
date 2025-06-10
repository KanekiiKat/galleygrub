package edu.estatuas.galleygrub.extras;

import java.util.Optional;

import edu.estatuas.galleygrub.order.Comanda;

public abstract class Extra {

    final static String CHEESE = "cheese";
    final static String SAUCE = "sauce";
    final static String SIZE_LARGE = "large";
    String extraProduct = "";
    Optional<Extra> nextExtra;

    public Extra() {
    }

    public void setNextExtra(Optional<Extra> nextExtra){
        this.nextExtra = nextExtra;
    }

    public void setExtraProduct(Extra extra) {
        this.extraProduct = extraProduct;
    }

    public abstract void sumExtras(Comanda comanda);  


}
