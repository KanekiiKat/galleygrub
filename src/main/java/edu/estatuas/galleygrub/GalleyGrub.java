package edu.estatuas.galleygrub;

import edu.estatuas.galleygrub.items.Item;
import edu.estatuas.galleygrub.items.Product;
import edu.estatuas.galleygrub.items.RetailPrice;

/**
 * 
 * Bob Esponja trabaja como cocinero en el Krusty Krab, 
 * restaurante famoso por su hamburguesa de autor
 * Krabby Patty.
 * El restaurante tiene un menu llamado Galley Grub
 * que puedes leer aquí:
 * https://spongebob.fandom.com/wiki/Galley_Grub
 * 
 * Las comandas son anotadas a mano por Squidward Tentacles.
 * El propierario Eugene H. Krabs -un agarrao-
 * en vez de adquirir un TPV ha decidido contratar
 * a un estudiante de Dual para que programar un software
 * para calcular el importe total del pedido e imprimir el recibo.
 * 
 * Intenta hacer como que programas si no quieres terminar
 * en la cocina ayudando a Bob a preparar Krusty Burguers.
 */

public class GalleyGrub {

    public static void display(Product item) {
        System.out.print("\t" + item.toString() + "\n");
    }

    public static void main( String[] args )
    {
        RetailPrice RetailPrice = new RetailPrice();

        /**
         * Crea un diccionario con los precios
         * de los extras.
         *  
         *  Los precios de los extras son estos:
         *  - cheese +0.25
         *  - sauce +0.50
         *  - medium +0.25
         *  - large +0.50
         * 
         * Lee los precios de los items en la imagen 
         * del menu proporcionada.
         */

        RetailPrice.init_prices();

        // formatea la salida de cada entrada del diccionario como prefieras
        System.out.print("\n\t --- PRICES ---  \n");
        RetailPrice.display();

                /**
         * Crea los items del menu 
         * y printa sus datos.
         * 
         * Krabby Patty
         * Coral Bits
         * Kelp Rings
         * Golden Loaf
         * Seafoam Soda
         * 
         * Incluye los metodos sobrescritos
         * equals y hascode para comparar objetos
         * de tipo Item.
         */

         System.out.print("\n\t --- GALLEY GRUB ---  \n");
        
         Product patty = new Item("Krabby Patty", 1.25);
         display(patty);
         Product bits = new Item("Coral Bits", 1.00);
         display(bits);
         Product rings = new Item("Kelp Rings", 1.50);
         display(rings);
         Product loaf = new Item("Golden Loaf", 2.00);
         display(loaf);
         Product soda = new Item("Seafoam Soda", 1.00);
         display(soda);

    }
}
