import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Demonstra os métodos universais disponíveis em quase todas as coleções.
 */
public class InterfaceCollection {
    public static void main(String[] args) {
        // Polimorfismo: Declaramos como 'Collection', instanciamos como 'ArrayList'
        Collection<String> frutas = new ArrayList<>();

        // 1. add()
        System.out.println("> Adicionando elementos...");
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        System.out.println("Coleção atual: " + frutas);

        // 2. size() e contains()
        System.out.println("\n> Verificações:");
        System.out.println("Tamanho atual: " + frutas.size());
        System.out.println("Contém 'Banana'? " + frutas.contains("Banana"));
        System.out.println("Contém 'Uva'? " + frutas.contains("Uva"));

        // 3. remove()
        System.out.println("\n> Removendo 'Maçã'...");
        frutas.remove("Maçã");
        System.out.println("Coleção após remoção: " + frutas);

        // 4. iterator() (Conceito básico)
        System.out.println("\n> Iterando com Iterator:");
        Iterator<String> it = frutas.iterator();
        while (it.hasNext()) {
            String fruta = it.next();
            System.out.println(" - " + fruta);
        }

        // 5. clear() e isEmpty()
        frutas.clear();
        System.out.println("\n> Após clear(), está vazia? " + frutas.isEmpty());
    }
}


