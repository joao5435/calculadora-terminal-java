package Aula06_Extras;

import java.util.Scanner;

public class Ex6_Extras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        // Entrada de dados
	        System.out.println("Entrada de dados:");
	        System.out.print("Digite o primeiro número: ");
	        int num1 = input.nextInt();
	        System.out.print("Digite o segundo número: ");
	        int num2 = input.nextInt();
	        System.out.print("Digite o terceiro número: ");
	        int num3 = input.nextInt();

	        // Processamento
	        int maior = Math.max(num1, Math.max(num2, num3)); // 1.1 Maior valor
	        int menor = Math.min(num1, Math.min(num2, num3)); // 1.2 Menor valor
	        int soma = num1 + num2 + num3; // 1.3 Soma dos valores
	        double media = soma / 3.0; // 1.4 Média dos valores

	        // Contagem de pares, ímpares, positivos, negativos e neutros
	        int pares = 0, impares = 0, positivos = 0, negativos = 0, neutros = 0;

	        // Função auxiliar para verificar cada número
	        int[] numeros = {num1, num2, num3};

	        for (int num : numeros) {
	            if (num % 2 == 0) {
	                pares++; // 1.5 Quantos números são pares
	            } else {
	                impares++; // 1.6 Quantos números são ímpares
	            }

	            if (num > 0) {
	                positivos++; // 1.7 Quantos números são positivos
	            } else if (num < 0) {
	                negativos++; // 1.8 Quantos números são negativos
	            } else {
	                neutros++; // 1.9 Quantos números são neutros (zero)
	            }
	        }

	        //Saída de 
	        System.out.println("\nSaída de dados:");
	        System.out.println("Maior valor: " + maior);
	        System.out.println("Menor valor: " + menor);
	        System.out.println("Soma dos valores: " + soma);
	        System.out.printf("Média dos valores: %.2f\n", media);
	        System.out.println("Quantidade de números pares: " + pares);
	        System.out.println("Quantidade de números ímpares: " + impares);
	        System.out.println("Quantidade de números positivos: " + positivos);
	        System.out.println("Quantidade de números negativos: " + negativos);
	        System.out.println("Quantidade de números neutros (zero): " + neutros);

	        input.close();
		

	}

}
