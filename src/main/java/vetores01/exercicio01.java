package vetores01;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vendas = new double[7];
        String[] dias = {"domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sabado"};

        double total = 0;
        int diaquemaisvendeu = 0;

        for (int i = 0; i < vendas.length; i++) {
            System.out.print("digite o faturamento de " + dias[i] + ": R$ ");
            vendas[i] = sc.nextDouble();

            total += vendas[i];

            if (vendas[i] > vendas[diaquemaisvendeu]) {
            }
        }
        double media = total / vendas.length;

        System.out.println("-------resumo do faturamento da semana--------");
        System.out.printf("total faturado: R$ %.2f\n", total);
        System.out.printf("media diaria: R$ %.2f\n", media);
        System.out.printf("dia que mais vendeu: %s (R$ %.2f)\n", dias[diaquemaisvendeu], vendas[diaquemaisvendeu]);
    }


}
