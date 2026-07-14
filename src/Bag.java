import java.util.Random;

//@ADM_21APR2026 Exercicio Módulo 1: JAVA. Tema 6 - Tarefa6: Bag
public class Bag {
    private String[] items;
    private int size;
    private Random random;

    public Bag(int capacidade) {
        items = new String[capacidade];
        random = new Random();
    }

    // adicionar um item
    public void add(String i) {
        if (size == items.length) {

            System.out.println("Bag cheia, sem espaço para : " + i);

        } else {
            items[size++] = i;
        }
    }

    //adicionar vários items
    public void addAll(String[] is) {
        for (String item : is) {
            if (size < items.length) {
                items[size++] = item;
            } else {
                System.out.println("Bag cheia, sem espaço para : " + item);
            }
        }
    }

    //remover de forma aleatória
    public String take() {
        if (size == 0) {
            System.out.println("A Bag esta vazia, porque nenhum item foi introduzido");
            return null;

        }


        int index = random.nextInt(size);
        String picked = items[index];

        // substituir pelo último
        items[index] = items[size - 1];
        items[size - 1] = null;
        size--;
        System.out.println("O item retidado aleatoriamente da Bag é: ");
        return picked;


    }
//listar os itens que não foram retirados da Bag

    public void listar() {
        if (size == 0) {
            System.out.println("Bag vazia.");
            return;
        }
        System.out.println("Lista dos itens que sobraram na lista");
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }


}

