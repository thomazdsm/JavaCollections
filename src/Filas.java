import java.util.*;

/**
 * 2.5 Filas (Queue e Deque)
 * Processamento de tarefas, FIFO, LIFO.
 */
public class Filas {
    public static void main(String[] args) {
        exemploQueue();
        exemploPriorityQueue();
        exemploDeque();
    }

    private static void exemploQueue() {
        System.out.println("\n=== Queue (LinkedList como Fila FIFO) ===");
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.offer("Cliente 1");
        filaBanco.offer("Cliente 2");

        System.out.println("Próximo a ser atendido (peek): " + filaBanco.peek());
        System.out.println("Atendendo (poll): " + filaBanco.poll()); // Remove e retorna
        System.out.println("Fila restante: " + filaBanco);
    }

    private static void exemploPriorityQueue() {
        System.out.println("\n=== PriorityQueue (Ordenação por Prioridade) ===");
        // Ordena por ordem natural (alfabética) ou Comparator
        Queue<String> prioridades = new PriorityQueue<>();

        prioridades.offer("Zebra");
        prioridades.offer("Abelha");
        prioridades.offer("Macaco");

        // Nota: A iteração simples (toString) pode não mostrar ordenado
        // Mas o poll() SEMPRE remove o menor elemento (cabeça)
        System.out.println("Fila interna (Heap): " + prioridades);

        System.out.print("Processando em ordem: ");
        while(!prioridades.isEmpty()) {
            System.out.print(prioridades.poll() + " -> ");
        }
        System.out.println("Fim");
    }

    private static void exemploDeque() {
        System.out.println("\n=== Deque (ArrayDeque como Pilha LIFO) ===");
        // Mais eficiente que a classe Stack antiga
        Deque<String> pilha = new ArrayDeque<>();

        pilha.push("Base");
        pilha.push("Meio");
        pilha.push("Topo");

        System.out.println("Topo: " + pilha.pop());
        System.out.println("Nova pilha: " + pilha);
    }
}