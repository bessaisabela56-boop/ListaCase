package pctExercicio1;

import java.util.Scanner;

public class ExeCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
		char option;
		double preco = 0;
		int quantidade;

		System.out.println("MENU CAFETERIA LEGAL");
		System.out.println("A- Café (R$4)");
		System.out.println("B- Suco (R$6)");
		System.out.println("C- Sanduíche (R$10)");
		System.out.println("Escolha uma opção");
		option = receba.next().charAt(0);
		System.out.println("Escolha a quantidade");
		quantidade = receba.nextInt();

		switch (option) {

		case 'A':
			System.out.println("Você escolheu Café");
			preco = 4 * quantidade;
			break;
		case 'B':
			System.out.println("Você escolheu Suco");
			preco = 6 * quantidade;
			break;
		case 'C':
			System.out.println("Você escolheu Sanduíche");
			preco = 10 * quantidade;
			break;

		default:
			System.out.println("opcao invalidada");

		}
		System.out.println("total da compra R$ " + preco);
		receba.close();
	}
}
