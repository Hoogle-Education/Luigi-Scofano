import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // printando sem pular linha
        System.out.print("Hello world");
        System.out.println("something");

        // tipos primitivos
        int idade = 22;

        // long = inteiro grande
        // 2L = numero da versao long
        long numero = 2L;

        float nota = 2.3F;
        double altura = 1.8;

        boolean estaChovendo = true;
        String palavra = "palavra";

        // operador reflexivo
        int a = 2;
        a += 1; // a = a + 1
        a /= 2; // a = a / 2

        // selecao

        if ( altura >= 1.80 )
            System.out.println("alto 🤠");
        else if ( altura >= 1.70 )
            System.out.println("medio");
        else {
            System.out.println("outra coisa");
            System.out.println("baixo");
        }

        // && - and
        // || - or

        int i = 0;

        while(i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("------");

        for (int pos = 0; pos < 10; pos++) {
            System.out.println(pos);
        }

        // ------

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        // 2 3
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

    }

}