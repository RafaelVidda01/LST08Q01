
public class   Telefone  {

	private long numero;
	
	public long getLerDigito1() {
		long a = (numero / 10000);
		return a;
	}
	public long getLerDigito2()	{
		long a =  (((numero / 10000)*10000) - this.numero)*-1 ;
		return a; 	
	}
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	public long getNumero() {
		return numero;
	}

}
