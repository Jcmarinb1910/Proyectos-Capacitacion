package mx.com.walmart.compra.capacitacion.exceptions;

public class NoConexion extends AssertionError{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoConexion(String mensage, Throwable causa) {
		super(mensage, causa);
	}
	
}


