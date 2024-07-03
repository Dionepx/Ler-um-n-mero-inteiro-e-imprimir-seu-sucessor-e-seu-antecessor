import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int sucessor = num + 1;
        int antecessor = num - 1;


        System.out.println("Sucessor: " + sucessor + "\nAntecessor: " + antecessor);
    }
}