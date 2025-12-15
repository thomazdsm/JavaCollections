import java.util.*;

/**
 * 2.4 Conjuntos (Set)
 * Coleções que NÃO permitem duplicidade.
 */
public class Conjuntos {
    public static void main(String[] args) {
        exemploHashSet();
        exemploLinkedHashSet();
        exemploTreeSet();
    }

    private static void exemploHashSet() {
        System.out.println("\n=== HashSet (Melhor Performance O(1)) ===");
        Set<String> set = new HashSet<>();

        System.out.println("Inserindo 'Java': " + set.add("Java"));
        System.out.println("Inserindo 'Python': " + set.add("Python"));
        System.out.println("Inserindo 'Java' novamente: " + set.add("Java")); // Retorna false

        System.out.println("Conteúdo (Ordem não garantida): " + set);
    }

    private static void exemploLinkedHashSet() {
        System.out.println("\n=== LinkedHashSet (Mantém Ordem de Inserção) ===");
        Set<String> set = new LinkedHashSet<>();

        set.add("Primeiro");
        set.add("Segundo");
        set.add("Terceiro");

        System.out.println("Conteúdo (Respeita inserção): " + set);
    }

    private static void exemploTreeSet() {
        System.out.println("\n=== TreeSet (Ordenado Naturalmente O(log n)) ===");
        Set<Integer> numeros = new TreeSet<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(30);

        System.out.println("Conteúdo (Ordenado): " + numeros);

        // Com Comparator Customizado (Ordem Reversa)
        Set<String> reverso = new TreeSet<>(Comparator.reverseOrder());
        reverso.add("A");
        reverso.add("C");
        reverso.add("B");
        System.out.println("TreeSet Reverso: " + reverso);
    }
}