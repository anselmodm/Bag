//@ADM_21APR2026 Exercicio Módulo 1: JAVA. Tema 6 - Tarefa6: Bag

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //introduzir a capacidade
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza a capacidade da Bag: ");
        int capacidade = in.nextInt();

        // cria a bag
        Bag myBag = new Bag(capacidade);

        // void addAll(String[] is) deve aceitar e guardar uma coleção de objetos
        myBag.addAll(getItems());
        // void add(String i) deve aceitar e guardar o item na coleção
        myBag.add("Keys");

        // String take() deve remover e retornar um elemento aleatório da Bag
        System.out.println(myBag.take());
        //listar o que sobrou depois da
        myBag.listar();

    }

    private static String[] getItems() {
        return new String[]{
                "Pen",
                "Book",
                "Laptop",
                "Powerbank"
        };

    }
}