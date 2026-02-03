package generics.aula_generics.app;

import generics.aula_generics.entities.A;
import generics.aula_generics.entities.B;
import generics.aula_generics.entities.C;
import generics.aula_generics.entities.Product;
import generics.aula_generics.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\Administrador\\Documents\\Computador,4000.55.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new A(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);

            System.out.println("Most expensive: ");
            System.out.println(x);

        }catch (IOException e) {
            e.printStackTrace();
        }
        list.add(new A("Tv", 900.00));
        list.add(new A("Tablet", 350.50));
        list.add(new A("Notebook", 1200.00));
        list.add(new B("Smartphone", 800.00));
        list.add(new B("Tablet", 900.00));
        list.add(new B("Notebook", 350.50));
        list.add(new C("Smartphone", 1200.00));
        list.add(new C("Tablet", 800.00));
        printList(list);




    }
    public static void printList(List<? > list){
        //list.add(new a("Tv", 900.00)); // nao compila porque o tipo curinga nao permite adicionar elementos na lista
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}



