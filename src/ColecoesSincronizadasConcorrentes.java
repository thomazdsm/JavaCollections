import java.util.*;
import java.util.concurrent.*;

/**
 * 2.9 Coleções Sincronizadas e Concorrentes
 * Para ambientes multithread.
 */
public class ColecoesSincronizadasConcorrentes {
    public static void main(String[] args) {
        exemploSincronizadaAntiga();
        exemploConcurrentHashMap();
        exemploCopyOnWrite();
    }

    private static void exemploSincronizadaAntiga() {
        System.out.println("\n=== Collections.synchronizedList (Wrapper) ===");
        List<String> lista = Collections.synchronizedList(new ArrayList<>());
        lista.add("Seguro?");
        // A iteração manual ainda precisa de bloco synchronized
        synchronized(lista) {
            for(String s : lista) System.out.println(s);
        }
    }

    private static void exemploConcurrentHashMap() {
        System.out.println("\n=== ConcurrentHashMap (Alta Performance) ===");
        // Permite acesso concorrente sem travar o mapa inteiro
        Map<String, String> cache = new ConcurrentHashMap<>();
        cache.put("Sessão1", "UsuárioA");
        cache.put("Sessão2", "UsuárioB");
        System.out.println("Cache: " + cache);
    }

    private static void exemploCopyOnWrite() {
        System.out.println("\n=== CopyOnWriteArrayList (Leitura sem Bloqueio) ===");
        // Ideal quando há muitas leituras e poucas escritas
        List<String> listaSegura = new CopyOnWriteArrayList<>();
        listaSegura.add("Config A");
        listaSegura.add("Config B");

        // Podemos iterar enquanto adicionamos (não lança ConcurrentModificationException)
        for (String s : listaSegura) {
            System.out.println("Lendo: " + s);
            if (s.equals("Config A")) {
                listaSegura.add("Config C"); // Adiciona numa cópia do array
                System.out.println("-> Adicionado Config C durante iteração");
            }
        }
        System.out.println("Lista Final: " + listaSegura);
    }
}