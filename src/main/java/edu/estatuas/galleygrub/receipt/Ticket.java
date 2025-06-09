package edu.estatuas.galleygrub.receipt;
import edu.estatuas.galleygrub.order.Comanda;

public interface Ticket {
    Comanda getOrder();
    void setChain(Extra extra);
    Extra getChain();
    Double total();
    void sumExtraCharge();
    void print();
}
