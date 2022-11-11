import java.util.Scanner;

public class Temperatura {
	public static void main (String []args){
		
		Scanner sp = new Scanner (System.in);
		System.out.println("Escriba su Temperatura ");
		
		float resultado = 32+(9*(sp.nextInt()/5));
		
		
		System.out.println("Resultado : " +resultado );
}
}