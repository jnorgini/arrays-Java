package application;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i = 0; i < n; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		
		int cont = 0;

		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				if(matrix[i][j] < 0)
				cont++;
			}
		}
		
		System.out.print("\nNegative numbers = " + cont);
		
		
		sc.close();

	}

}
