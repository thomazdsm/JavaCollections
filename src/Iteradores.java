import java.util.*;

/**
 * 2.7 Iteradores
 * Manipulação segura durante iteração.
 */
public class Iteradores {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");

        System.out.println("Lista Original: " + nomes);

        // Exemplo de erro comum (Comentado para não quebrar a execução)
        // for (String s : nomes) {
        //     if (s.equals("Maria")) nomes.remove(s); // Lança ConcurrentModificationException
        // }

        System.out.println("\n> Removendo 'Maria' de forma segura com Iterator:");
        Iterator<String> it = nomes.iterator();
        while (it.hasNext()) {
            String atual = it.next();
            if (atual.equals("Maria")) {
                it.remove(); // Remove o elemento atual da coleção subjacente
                System.out.println("Maria removida.");
            }
        }

        System.out.println("Lista Final: " + nomes);
    }
}