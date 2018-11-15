package application;

import java.util.Scanner;
import outro.TrataExcessao;;

public class Program {

	public static void main(String[] args) {
		System.out.println("good morning");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number");
		int n1 = sc.nextInt();

		System.out.println("Enter Second number");
		int n2 = sc.nextInt();

		TrataExcessao x;
		x = new TrataExcessao();
		
		int[][] mat1 = new int[n1][n2];
	
		x.setMat(mat1);
		x.metodo1();


		
		System.out.println("Enter the number you`re looking for");
		int n3 = sc.nextInt();	
		x.setN3(n3);
		
		
		x.metodo2();
		
				
				
//		for ( i=0; i<mat.length; i++) {
//			for ( j=0; j<mat[i].length; j++) {
//				if (mat[i][j] == n3) {
//			    System.out.println("Position: "+ i+","+j+":");
//				System.out.println("Left: "+ (mat[i][j-1]));
//				System.out.println("Right: "+ (mat[i][j+1]));
//				System.out.println("Down: "+ (mat[i+1][j]));
//				System.out.println("Up: "+ (mat[i-1][j]));
//			}
//		}
//	}
		
		sc.close();
			
		}
	


		
		
	}

