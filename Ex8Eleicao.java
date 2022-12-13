package lista_faccat;

import java.util.Scanner;

public class Ex8Eleicao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Digite o total de eleitores do municipio e a quantidade de votos validos, brancos e nulos para ser mostrado o percentual que cada um representa do total");

        System.out.print("Total de Eleitores: ");
        float total = sc.nextFloat();

        System.out.print("Digite a quantidade de votos validos: ");
        float validos = sc.nextFloat();

        System.out.print("Digite a quantidade de votos brancos: ");
        float brancos = sc.nextFloat();

        System.out.print("Digite a quantidade de votos nulos: ");
        float nulos = sc.nextFloat();

        validos = validos * 100 / total;

        System.out.println(validos + "% de votos válidos");

        brancos = brancos * 100 / total;

        System.out.println(brancos + "% de votos em branco");

        nulos = nulos * 100 / total;

        System.out.println(nulos + "% votos nulos");

        sc.close();

    }
}
