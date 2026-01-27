package lambda.aulaComparator.application;

import lambda.aulaComparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 1000.00, true));
        list.add(new Product("Mouse", 200.00, true));
        list.add(new Product("Teclado", 50.00, true));
        list.add(new Product("Monitor", 1500.00, false));
        list.add(new Product("Impressora", 150.00, true));
        list.add(new Product("Mouse Pad", 2.50, true));
        list.add(new Product("Cadeira", 150.00, true));
        list.add(new Product("sofá", 180.00, false));
        list.add(new Product("jarro", 550.00, true));
        list.add(new Product("caneta", 1.50, true));
        list.add(new Product("lapis", 999.50, true));
        list.add(new Product("lapis de cor", 1.50, true));

        /**
         * Comparator como Classe Anonima:
         *     voce cria uma nova instancia de Comparator e implementa o metodo compare dentro dela.
         * */
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return 0;
            }
        };


    }
}
