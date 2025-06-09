package edu.estatuas.galleygrub.extras;

import java.util.Optional;

import edu.estatuas.galleygrub.order.Comanda;

public abstract class Extra {

    final static String CHEESE = "";
    final static String SAUCE = "";
    final static String SIZE_LARGE = "";
    String extraProduct = "";
    Optional<Extra> nextExtra;

    public Extra() {
    }

    public void setExtraProduct(Extra extra) {
        this.extraProduct = extraProduct;
    }

    public abstract void sumExtras(Comanda comanda);  


}
