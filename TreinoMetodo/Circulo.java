package prjCirculo;

import java.util.Scanner;

public class Circulo {
	
	double pi = 3.14;

	public void areaCirculo1(){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo");
		double r = in.nextDouble();
		
		double res=(r*r)*pi;
		
		System.out.println(res);
		
		in.close();
		
	}
	
public void areaCirculo2(double r) {

		double res=(r*r)*pi;
		
		System.out.println(res);
		
}

public double areaCirculo3(){
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digite o raio do círculo");
	double r = in.nextDouble();
	
	double res=(r*r)*pi;
	
	System.out.println(res);
	
	in.close();
	
	return res;

}

public double areaCirculo4(double r) {

	double res=(r*r)*pi;
	
	System.out.println(res);
	
	return res;
}
}
