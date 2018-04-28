
public class Interurbano extends Telefone {

	public long getCodigoDDD() {
		long a = (getNumero() / 100000000);
		return a;
		//6134111169
	}
	
}
