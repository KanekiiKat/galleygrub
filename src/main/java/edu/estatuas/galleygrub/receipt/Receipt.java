package edu.estatuas.galleygrub.receipt;

import edu.estatuas.galleygrub.extras.Extra;
import edu.estatuas.galleygrub.order.Comanda;

public class Receipt implements Ticket {
    
    private Double total = 0.0;
    private Comanda order;
    private Extra firstExtra;

    public Receipt(Comanda comanda) {
        this.order = comanda;
    }

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    @Override
    public void setChain(Extra extra) {
        this.firstExtra = extra;
    }

    @Override
    public Extra getChain() {
        return this.firstExtra;
    }
    

    @Override
    public void sumExtraCharge() {

    }

    @Override
    public Double total() {
        return this.total;
    }

    @Override
    public void print() {
        order.display();
        System.out.print("\tTOTAL --------> " + total().toString() + "$\n");
    }

    
    


}
