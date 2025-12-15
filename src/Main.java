public class Main {
    public static void main(String[] args) {
        System.out.println("> EXECUÇÃO DOS EXEMPLOS - JAVA COLLECTIONS");
        System.out.println("> Para testar cada tópico individualmente, execute a classe correspondente.");
        System.out.println("> Exemplo: execute 'InterfaceCollection.main()' para ver os exemplos básicos.\n");

        // Aqui você pode descomentar para rodar tudo de uma vez, se quiser

        System.out.println("--- 1. Interface Collection ---");
        InterfaceCollection.main(args);

        System.out.println("\n--- 2. Listas ---");
        Listas.main(args);

        System.out.println("\n--- 3. Conjuntos ---");
        Conjuntos.main(args);

        System.out.println("\n--- 4. Filas ---");
        Filas.main(args);

        System.out.println("\n--- 5. Mapas ---");
        Mapas.main(args);

        System.out.println("\n--- 6. Iteradores ---");
        Iteradores.main(args);

        System.out.println("\n--- 7. Imutáveis ---");
        ColecoesImutaveis.main(args);

        System.out.println("\n--- 8. Concorrentes ---");
        ColecoesSincronizadasConcorrentes.main(args);
    }
}