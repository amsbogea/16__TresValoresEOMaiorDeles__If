package tresValoresEOMaiorDeles__If;

import java.util.Scanner;

public class TresValoresEOMaiorDeles__If {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1,num2, num3 = 0;
		
		System.out.println("Digite o primeiro valor: ");
		num1 = input.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		num2 = input.nextInt();
		while (num2 == num1 ) {
			System.out.println("NÚMERO REPETIDO\nDigite o segundo valor: ");
			num2 = input.nextInt();
		}
		
		System.out.println("Digite o terceiro valor: ");
		num3 = input.nextInt();
		while (num3 == num1 || num3 == num2 ) {
			System.out.println("NÚMERO REPETIDO\nDigite o terceiro valor: ");
			num3 = input.nextInt();
		}
		
		if (num1 > num2 && num1 > 3) {
			System.out.println("Maior número é, " + num1);
		} else if (num2 > num1 && num2 > num3){
			System.out.println("Maior número é, "+ num2);
		} else if (num3 > num1 && num3 > num2){
			System.out.println("Maior número é, "+ num3);
		}
		
		input.close();
	}

}
