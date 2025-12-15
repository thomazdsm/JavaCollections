import java.util.*;

/**
 * 2.8 Coleções Imutáveis
 * Factory methods do Java 9+
 */
public class ColecoesImutaveis {
    public static void main(String[] args) {
        System.out.println("\n=== List.of() (Java 9+) ===");

        try {
            // Cria uma lista imutável
            List<String> dias = List.of("Segunda", "Terça", "Quarta");
            System.out.println("Dias úteis: " + dias);

            // Tentar modificar lança exceção
            System.out.println("Tentando adicionar 'Quinta'...");
            dias.add("Quinta");

        } catch (UnsupportedOperationException e) {
            System.out.println("ERRO ESPERADO: Não é possível modificar uma coleção imutável.");
        }

        System.out.println("\n=== Collections.unmodifiableList() ===");
        List<String> original = new ArrayList<>();
        original.add("A");
        List<String> readOnly = Collections.unmodifiableList(original);

        System.out.println("Read Only: " + readOnly);
        // readOnly.add("B"); // Lançaria erro

        // Cuidado: Se mexer na original, a view muda!
        original.add("B");
        System.out.println("Read Only após alterar original: " + readOnly);
    }
}