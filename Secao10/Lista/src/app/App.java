package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando uma lista
        List<String> list = new ArrayList<>();
        // Adicionando valores na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        // Adicionando no indíce indicado
        list.add(2, "Marco");
        // Impressão do tamanho da lista
        System.out.println(list.size());
        // Percorrendo a lista
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------");
        // Removendo valores da lista
        // list.remove("Anna");
        // list.remove(1);
        
        // Removendo por predicado
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------");
        // Impressão do indíce
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        // Deverá imprimir como resultado -1 pois não há esse valor
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("--------------");

        // Filtro de lista para criar uma nova só com os necessários
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);   
        }

        //Procurar na lista pelo primeiro elemento por predicado
        System.out.println("--------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }    
}