
package outro;
import java.util.Scanner;

public class TrataExcessao {

	Scanner sc = new Scanner(System.in);
	private int n1;int n2; int n3;
	private int[][] mat = new int[n1][n2]; 
	
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}


	
	
	public int[][] getMat() {
		return mat;
	}
	public void setMat(int[][] mat) {
		this.mat = mat;
	}
	
	
	public void metodo1() {
		System.out.println("lenght"+ mat.length); 
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}	
		}
	}
	
	
	public void metodo2() throws ArrayIndexOutOfBoundsException { 
		   try {  
				for (int i=0; i<this.mat.length; i++) {
					for (int j=0; j<mat[i].length; j++) {
						if (mat[i][j] == n3) {
					    System.out.println("Position: "+ i+","+j+":");
						System.out.println("Left: "+ (mat[i][j-1]));
						System.out.println("Right: "+ (mat[i][j+1]));
						System.out.println("Down: "+ (mat[i+1][j]));
						System.out.println("Up: "+ (mat[i-1][j]));
					}
				}
			}  
		   } 
		   finally {  
		       System.out.println("Fim de m2."); 
		    }
		}
	
}
