package lambda.aulaComparator.application;

import lambda.aulaComparator.entities.Product;
import utils.PrintarLista;

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

        PrintarLista.printLista(list);



        /**
         * Comparator como Classe Anonima:
         *     voce cria uma nova instancia de Comparator e implementa o metodo compare dentro dela.
         * */
        Comparator<Product> comparatorClasseAnonima = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return 0;
            }
        };

        PrintarLista.printLista(list);

        /**
         *  Comparator como Objeto de Expressão  lambda Com chaves:
         *         voce cria uma instancia de Comparator e passa como parametro um lambda expression.
         *
         *  só que agora voce pode chamar o metodo sort sem precisar criar uma instancia de Comparator.
         * */
        Comparator<Product> comparatorObjetoExpressaoComChaves = (P1, P2) -> {
            return P1.getName().toUpperCase().compareTo(P2.getName().toUpperCase());
        };

        list.sort(comparatorObjetoExpressaoComChaves);
        PrintarLista.printLista(list);

        /**
         * e uma forma mais limpa e simples.
         *         quando so se tem uma linha de codigo, o return e chaves podem ser descartados.
         * */
        Comparator<Product> comparatorObjetoExpressaoSemChaves = (P1, P2) -> P1.getName().toUpperCase().compareTo(P2.getName().toUpperCase());
        list.sort(comparatorObjetoExpressaoSemChaves);

        PrintarLista.printLista(list);

        /**
         *  melhorando ainda mais, ele pode apenas ser dentro no sort, veja:
         *  (p1, p2) isso são os produtos, os parametros do "metodo"
         *   -> isso é chamado de ArrowFunction porque parece uma flexa, lol
         *   depois do arrowFunction vem o "corpo do metodo"
         *   algo que vai ser testado, consumido, execultado, podendo ou não ter retorno(proximas aulas)
         *
         * */
        list.sort((p1, p2) -> p1.getName().toUpperCase()
                .compareTo(p2.getName().toUpperCase()
                ));
        PrintarLista.printLista(list);
    }
}
