import java.util.Scanner;

public class LeeDosNumeros {
	
	public static void main (String []args){
	
		Scanner sp = new Scanner (System.in);
		System.out.println("Ingrese el primer numero");
		String num1 = sp.nextLine();
		
		System.out.println("Ingrese el primer numero");
		String num2= sp.nextLine();
		
		System.out.println("Los numeros ingresados son: " 
		+num1 + " y " +num2 );
		
	
	}
}