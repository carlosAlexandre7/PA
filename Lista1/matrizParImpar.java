import java.util.Scanner;
public class matrizParImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		int a[][] = new int [3][3];
		
		System.out.println("Digite os numeros de A");

		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				
				a[i][j] = in.nextInt();
						
			}
		}
		
		int par=0,imp=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				if(a[i][j]%2 == 0) {
					
					par++;
				}
				else { 	
					imp++;
				}
				
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println( );
		
		}
		
		System.out.print("Há "+par+" numeros pares e "+imp+" numeros impares");
			
		}
		
		
	}
	
