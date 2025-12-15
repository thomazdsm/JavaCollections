import java.util.*;

/**
 * 2.6 Mapas (Map)
 * Chave -> Valor. Não herda de Collection.
 */
public class Mapas {
    public static void main(String[] args) {
        exemploHashMap();
        exemploLinkedHashMap();
        exemploTreeMap();
    }

    private static void exemploHashMap() {
        System.out.println("\n=== HashMap (Rápido, sem ordem) ===");
        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Caneta", 100);
        estoque.put("Lápis", 50);
        estoque.put("Borracha", 30);
        estoque.put("Caneta", 90); // Substitui o valor da chave "Caneta"

        System.out.println("Estoque de Caneta: " + estoque.get("Caneta"));
        System.out.println("Contém chave 'Régua'? " + estoque.containsKey("Régua"));

        System.out.println("Todas as chaves: " + estoque.keySet());
    }

    private static void exemploLinkedHashMap() {
        System.out.println("\n=== LinkedHashMap (Ordem de Inserção) ===");
        Map<Integer, String> acesso = new LinkedHashMap<>();

        acesso.put(1, "Login");
        acesso.put(2, "Dashboard");
        acesso.put(3, "Perfil");

        System.out.println("Histórico de navegação: " + acesso.values());
    }

    private static void exemploTreeMap() {
        System.out.println("\n=== TreeMap (Chaves Ordenadas) ===");
        Map<String, String> dicionario = new TreeMap<>();

        dicionario.put("Casa", "House");
        dicionario.put("Bola", "Ball");
        dicionario.put("Avião", "Airplane");

        // Vai imprimir Avião, Bola, Casa (Ordem alfabética das chaves)
        for (Map.Entry<String, String> entry : dicionario.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}