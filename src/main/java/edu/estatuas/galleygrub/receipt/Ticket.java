package edu.estatuas.galleygrub.receipt;
import edu.estatuas.galleygrub.order.Comanda;

public interface Ticket {
    Comanda getOrder();
    
    Double total();
    void sumExtraCharge();
    void print();
}
