package Matriz;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		Scanner luke = new Scanner(System.in);
		Scanner boba = new Scanner(System.in);
		
		System.out.print("Digite aquantidade de linhas da primeira matriz: ");
		
		int i = luke.nextInt();
		
		System.out.print("Digite aquantidade de colunas da primeira matriz: ");
		
		int j = luke.nextInt();
		
		double p[][] = new double[i][j];
		
		for (int k = 0; k < i; k++) {
			
			for (int l = 0; l < j; l++) {
				
				System.out.print("Digite o valor de [" + (k + 1) + ";" + (l + 1) + "]: ");
				
				double aux;
				double auxi;
				String a = boba.nextLine();
				
				try {
					
					p[k][l] = Double.parseDouble(a);
					
				} catch (Exception ex) {
					
					String[] vader = a.split("/");
					String solo = vader[0];
					String leia = vader[1];
					
					aux = Double.parseDouble(solo);
					auxi = Double.parseDouble(leia);
					
					p[k][l] = (aux / auxi);
				}
				
					
				
					
				
			}
			
		}
		
		System.out.print("Digite aquantidade de linhas da segunda matriz: ");
		
		int m = luke.nextInt();
		
		System.out.print("Digite aquantidade de colunas da segunda matriz: ");
		
		int n = luke.nextInt();
		
		double s[][] = new double[m][n];
		
		for (int k = 0; k < m; k++) {
			
			for (int l = 0; l < n; l++) {
				
				System.out.print("Digite o valor de [" + (k + 1) + ";" + (l + 1) + "]: ");
				
				double aux;
				double auxi;
				String a = boba.nextLine();
				
				try {
					
					s[k][l] = Double.parseDouble(a);
					
				} catch (Exception ex) {
					
					String[] vader = a.split("/");
					String solo = vader[0];
					String leia = vader[1];
					
					aux = Double.parseDouble(solo);
					auxi = Double.parseDouble(leia);
					
					s[k][l] = (aux / auxi);
				
				
				}
			}
			
		}
		
		System.out.println("Primeira:");
		
		for (int k = 0; k < i; k++) {
			
			for (int l = 0; l < j; l++) {
				
				System.out.print(p[k][l] + " ");
				
			}
			
			System.out.println(" ");
			
		}
		
		System.out.println("Segunda:");
		
		for (int k = 0; k < m; k++) {
			
			for (int l = 0; l < n; l++) {
				
				System.out.print(s[k][l] + " ");
				
			}
			
			System.out.println(" ");
			
		}
		
		System.out.println(" ");
		
		char x = 'z';
		if (j == m) {
			x = 'v';
		}
		
		
		switch (x) {
		case 'v' : {
			
			
			
			double r[][] = new double[i][n];
			
			for (int k = 0; k < i; k++) {
				
				for (int l = 0; l < n; l++) {
					
					
					for (int d = 0; d < j; d++) {
						
						double w = p[k][d];
						double y = s[d][l];
						
						r[k][l] += (w * y);
						
						
					}
					
					
				}
				
			}
			
			
			System.out.println("Resltado: ");
			
			for (int k = 0; k < i; k++) {
				
				for (int l = 0; l < n; l++) {
					
					System.out.print(r[k][l] + " ");
					
				}
				
				System.out.println(" ");
				
			}
			
		}
		default:
			
		}
		
		if (j != m) {
			
			System.out.println("N?o ? poss?vel multiplicar!");
			
		}
		
	}

}
