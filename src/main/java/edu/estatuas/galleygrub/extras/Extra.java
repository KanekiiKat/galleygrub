package edu.estatuas.galleygrub.extras;

import java.util.Optional;

import edu.estatuas.galleygrub.order.Comanda;

public abstract class Extra {

    final static String CHEESE = "cheese";
    final static String SAUCE = "sauce";
    final static String SIZE_LARGE = "large";
    String extraProduct = "";
    Optional<Extra> nextExtra = Optional.ofNullable(null);

    public Extra() {
    }

    public void setNextExtra(Extra nextExtra){
        this.nextExtra = Optional.of(nextExtra);
    }


    public abstract void sumExtras(Comanda comanda);
    
}
