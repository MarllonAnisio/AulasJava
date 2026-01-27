package lambda.aulaComparator.application;

import lambda.aulaComparator.entities.Product;

import java.util.Comparator;
/**
 * Comparator objeto de Classe Separada:
 *         na classe MyComparator tem um metodo compare que recebe dois objetos do tipo MyClass e retorna um int. (igual compareTo do Java)
 *         voce chama a classe MyComparator e passa como parametro um objeto p1, p2 do tipo MyClass.
 * */
public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
