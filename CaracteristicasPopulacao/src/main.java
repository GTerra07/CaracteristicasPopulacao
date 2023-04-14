import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contMulheres = 0;
        int contHabitantes = 0;

        while (true) {
            System.out.print("Digite o sexo (m/f) do habitante: ");
            String sexo = input.nextLine();

            if (!sexo.equals("m") && !sexo.equals("f")) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite a cor dos olhos (a/v/c/p) do habitante: ");
            String corOlhos = input.nextLine();

            if (!corOlhos.equals("a") && !corOlhos.equals("v") && !corOlhos.equals("c") && !corOlhos.equals("p")) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite a cor dos cabelos (l/c/p/r) do habitante: ");
            String corCabelos = input.nextLine();

            if (!corCabelos.equals("l") && !corCabelos.equals("c") && !corCabelos.equals("p") && !corCabelos.equals("r")) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite a idade (entre 10 e 100 anos) do habitante: ");
            int idade = input.nextInt();

            if (idade == -1) {
                break;
            }

            if (idade < 10 || idade > 100) {
                System.out.println("Idade inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite o valor do salário do habitante: ");
            double salario = input.nextDouble();

            if (salario < 0) {
                System.out.println("Salário inválido. Tente novamente.");
                continue;
            }

            input.nextLine(); 

            contHabitantes++;

            if (sexo.equals("f") && idade >= 18 && idade <= 35 && corOlhos.equals("c") && corCabelos.equals("c")) {
                contMulheres++;
            }
        }

        if (contHabitantes == 0) {
            System.out.println("Nenhum habitante foi cadastrado.");
        } else {
            double percentualMulheres = ((double) contMulheres / contHabitantes) * 100;
            System.out.printf("O percentual de mulheres com idade entre 18 e 35 anos, olhos castanhos e cabelos castanhos é de %.2f%%.\n", percentualMulheres);
        }

        input.close();
    }
}
