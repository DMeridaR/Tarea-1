import java.util.Scanner;

public class Circunferencia {
	public static void main (String []args){
		
		Scanner sp = new Scanner (System.in);
		System.out.println("Ingrese su radio: ");
		
		float radio = sp.nextFloat();
		
		System.out.println("El área es:  " 
				+(Math.PI*Math.pow(radio,2)));
}
}

