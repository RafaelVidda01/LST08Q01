
public class Internacional extends Telefone {

	public long getCodigoPais() {
		long a = (getNumero() / 100000000);
		long b = ( a /100 );
		return b;
	}
}
