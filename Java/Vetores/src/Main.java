import java.util.Scanner;

public class Main {

    public static void adicionaElemento(int[] vetor, int elemento) {
        int[] copia = vetor;
        int tamanho = vetor.length;
        vetor = new int[tamanho + 1];

        for(int i = 0; i < copia.length; i++) {
            vetor[i+1] = copia[i];
        }

        vetor[0] = elemento;
    }

    public static void main(String[] args) {


        Scanner keyboardInput = new Scanner(System.in);

        // String nome = keyboardInput.next();
        // pega a proxima string

//        System.out.print("Digite sua idade: ");
//        int idade = keyboardInput.nextInt();
//
//        System.out.print("Digite sua altura: ");
//        double altura = keyboardInput.nextDouble();
//
//        System.out.print("Digite seu nome: ");
//        keyboardInput.nextLine();
//        String nomeCompleto = keyboardInput.nextLine();
//
//        System.out.println("name: " + nomeCompleto);
//        System.out.println("age: " + idade);
//        System.out.println("height: " + altura);

        // vetor n elementos - pos 0 ate n-1
        // int[] inteiros = {1, 2, 3, 4}; // declaracao hard code
        // - tem tamanho fixo
        // - eh homogeneo

        System.out.print("Insira o tamanho: ");
        int tamanho = keyboardInput.nextInt();

        int[] inteiros = new int[100000];

        for(int i = 0; i < inteiros.length; i++) {
            inteiros[i] = keyboardInput.nextInt();
        }

        System.out.print("Digite um valor para ser adicionado no inicio: ");
        int novoValor = keyboardInput.nextInt();
        adicionaElemento(inteiros, novoValor);

        // inteiros -> [ , , , , ]
        // tamanho = 3
        // copia -> [50, 52, 53, 53]

        // for( /inicio/ ; /limite/ ; /atualiza/ )
        for(int i = 0; i < inteiros.length; i++) {
            System.out.print(inteiros[i] + " ");
        }

    }
}