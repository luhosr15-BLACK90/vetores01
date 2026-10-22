import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] codigos = {101,102,103,104,105};
        double[] precos = {15.50,42.00,9.99,120.00,5.75};

        System.out.print("digite o codigo do produto para consulta: ");
        int codigodebusca = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigodebusca) {
                System.out.printf("preco do produto: R$ %.2f\n", precos[i]);
                encontrado = true;
                break;
            }
        }
        if(encontrado) {
            System.out.println("produto não cadastro.");
        }
    }
}
