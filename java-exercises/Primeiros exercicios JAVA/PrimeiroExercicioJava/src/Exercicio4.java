// MULTIPLICAR UM N�MERO POR 8 SEM UTILIZAR O OPERADOR * //

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[]args){
		double result, num;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um n�mero para ser multiplicado por 8: ");
		num = input.nextDouble();
		result = num + num + num + num + num + num + num + num;
				
		System.out.println("Esse � o resultado do n�mero multiplicado: " +result);
		
		
	}
}
