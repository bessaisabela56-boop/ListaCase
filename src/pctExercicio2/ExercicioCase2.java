package pctExercicio2;

import java.util.Scanner;

public class ExercicioCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner receba = new Scanner(System.in);
		int option;
		double preco = 0;
		int quantidade;

		System.out.println("MENU CAFETERIA LEGAL");
		System.out.println("1- Hambúrguer (R$15)");
		System.out.println("2- Pizza (R$20)");
		System.out.println("3- Refrigerante (R$5)");
		System.out.println("Escolha uma opção");
		option = receba.nextInt();
		System.out.println("Escolha a quantidade");
		quantidade = receba.nextInt();
		
		switch (option) {

		case 1:
			System.out.println("Você escolheu Hambúrguer");
			preco = 15 * quantidade;
			break;
		case 2:
			System.out.println("Você escolheu Pizza");
			preco = 20 * quantidade;
			break;
		case 3:
			System.out.println("Você escolheu Refrigerante");
			break;

		default:
			System.out.println("opcao invalidada");

		}
		if(quantidade>=3) {
			System.out.println("Você recebeu 10% de desconto R$" + (preco-(preco * 0.10)));
		}else {
			System.out.println("O total da sua compra é R$ " + preco);
		}
	
		receba.close();
		
		

	}

}
