import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] estoque = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("informe a quantidade de produto no estoque " + (i + 1) + ": ");
            estoque[i] = sc.nextInt();

        }
        int contadorCrit = 0;
        System.out.println("----produto com menos de 5 unidades----");
        for (int i = 0; i < 10; i++) {
            if (estoque[i] < 5) {
                System.out.println("produto na posição " + i + " com " + estoque[i] + "unidade.");
                contadorCrit++;
            }
        }
        System.out.println("total de produtos em estado critico:" + contadorCrit);
    }
}
