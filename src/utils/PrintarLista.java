package utils;

import java.util.List;

public class PrintarLista {
    public static void printLista(List<?> list) {
        System.out.println("===========================PRINTA LISTA==========================");
        for (Object obj : list) {
            System.out.println("| " + obj + " |");
        }
        System.out.println("==================================================================");
        System.out.println();
    }
}
