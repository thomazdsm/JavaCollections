import java.util.*;

/**
 * Coleções ordenadas que permitem duplicatas.
 */
public class Listas {
    public static void main(String[] args) {
        exemploArrayList();
        exemploLinkedList();
        exemploVectorStack();
    }

    private static void exemploArrayList() {
        System.out.println("\n=== ArrayList (Acesso Rápido) ===");
        List<String> nomes = new ArrayList<>();

        // Adiciona elementos
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Beatriz");
        nomes.add("Ana"); // Permite duplicatas

        // Acesso posicional O(1)
        System.out.println("Elemento no índice 1: " + nomes.get(1));

        // Ordenação
        Collections.sort(nomes);
        System.out.println("Lista ordenada: " + nomes);
    }

    private static void exemploLinkedList() {
        System.out.println("\n=== LinkedList (Inserção/Remoção Rápida nas pontas) ===");
        LinkedList<String> fila = new LinkedList<>();

        fila.add("Documento 1");
        fila.addFirst("Urgente: Documento 2"); // O(1)
        fila.addLast("Documento 3");          // O(1)

        System.out.println("Lista: " + fila);
        System.out.println("Primeiro: " + fila.getFirst());
        System.out.println("Último: " + fila.getLast());
    }

    private static void exemploVectorStack() {
        System.out.println("\n=== Vector e Stack (Legado) ===");
        // Vector é sincronizado (thread-safe), mas lento
        Vector<Integer> vetor = new Vector<>();
        vetor.add(10);
        vetor.add(20);
        System.out.println("Vector: " + vetor);

        // Stack estende Vector (LIFO)
        Stack<String> pilha = new Stack<>();
        pilha.push("Prato 1");
        pilha.push("Prato 2");
        System.out.println("Topo da pilha (peek): " + pilha.peek());
        System.out.println("Removendo do topo (pop): " + pilha.pop());
    }
}