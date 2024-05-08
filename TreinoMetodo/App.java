package prjCirculo;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		System.out.println("digite o raio");
		Scanner in = new Scanner(System.in);
		
		double r = in.nextDouble();
				
		Circulo c = new Circulo();
		
	    c.areaCirculo2(r);
		

	}

}
