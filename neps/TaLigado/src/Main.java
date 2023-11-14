import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void show(int[][] grafo, int tamanho) {

        for (int i = 0; i <= tamanho; i++) {
            for (int j = 0; j <= tamanho; j++) {
                System.out.print(grafo[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void solveWithAdjacencyMatrix(int vertices, int interacoes, int[][] grafo) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < interacoes; i++) {
            int operacao = scanner.nextInt();
            int origem = scanner.nextInt();
            int destino = scanner.nextInt();

            if(operacao == 1) {
                grafo[origem][destino] = 1;
                grafo[destino][origem] = 1;
            } else {
                System.out.println(grafo[origem][destino]);
            }

            // show(grafo, vertices);
        }
    }

    public static void main(String[] args) {

        int maxVertices = 10010;
        int[][] grafo = new int[maxVertices][maxVertices];
        Scanner scanner = new Scanner(System.in);

        int vertices = scanner.nextInt();
        int interacoes = scanner.nextInt();

        Set<Integer>[] listaAdjancencia = new HashSet[vertices];

        for (int i = 0; i < vertices; i++) {
            listaAdjancencia[i] = new HashSet<>();
        }

    }
}