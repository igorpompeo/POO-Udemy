package model.exceptions;

public class DomainException extends RuntimeException {
	/**
	 * Declaração de uma classe serialazible
	 */
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super (msg);
	}
}
