package lista_faccat;

import java.util.Scanner;

public class Ex9ReajusteSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario atual do funcionario e o percentual de ajuste para calcular o salario total");

        System.out.print("Digite o salario atual: ");
        float salario = sc.nextFloat();

        System.out.print("Digite o percentual de ajuste: ");
        float percentual = sc.nextFloat();

        salario = salario + salario * (percentual / 100);

        System.out.println("O salario com ajuste é de: R$" + salario);

        sc.close();

    }
}
