import java.util.Scanner;

public class PhoneCellApp {
	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		System.out.print("Enter Number : ");
		long numero = Long.parseLong(teclado.nextLine());
	//
		Telefone num = new Telefone();
		num.setNumero(numero);
		long n1 = num.getLerDigito1();
		long n2 = num.getLerDigito2();
	// 
		Interurbano regiao = new Interurbano();
		regiao.setNumero(numero);
		long r1 = regiao.getCodigoDDD();
	//
		Internacional pais = new Internacional();
		pais.setNumero(numero);
		long p1 = pais.getCodigoPais();
		
		System.out.print( p1);
		
	
		
		teclado.close();
	}
}
