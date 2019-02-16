package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		int nb;
		System.out.println("Digite o numero que deseja buscar");
		nb = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			System.out.println();
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == nb) {
					System.out.println("Posicao " + i + "," + j + ":");
					if (j - 1 >= 0) {
						System.out.print("Esquerda: " + mat[i][j - 1] + " ");
					}
					if (i - 1 >= 0) {
						System.out.print("Cima: " + mat[i - 1][j] + " ");
					}
					if (j + 1 < mat[1].length) {
						System.out.print("Direita: " + mat[i][j + 1] + " ");
					}
					if (i + 1 < mat.length) {
						System.out.print("Baixo: " + mat[i + 1][j] + " ");
					}
				}
			}
		}

		sc.close();
	}
}