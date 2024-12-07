package Aula06_Extras;

import java.util.Scanner;

public class Ex6_Extras_Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 // Entrada de dados
        System.out.println("Entrada de dados:");
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = input.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        // Processamento
        double resultado = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Erro: Operador inválido.");
                operacaoValida = false;
        }

        // Saída de dados
        if (operacaoValida) {
            System.out.println("\nSaída de dados:");
            System.out.printf("Resultado de %.2f %c %.2f = %.2f\n", num1, operador, num2, resultado);
        }

	}

}
