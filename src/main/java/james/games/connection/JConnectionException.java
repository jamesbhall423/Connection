/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection;

public class JConnectionException extends Exception {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Method JConnectionException
	 *
	 *
	 */
	public JConnectionException() {
		super();
	}

	/**
	 * Method JConnectionException
	 *
	 *
	 * @param message
	 *
	 */
	public JConnectionException(String message) {
		super(message);
	}

	/**
	 * Method JConnectionException
	 *
	 *
	 * @param message
	 * @param cause
	 *
	 */
	public JConnectionException(String message, Throwable cause) {
		super(message,cause);
	}

	/**
	 * Method JConnectionException
	 *
	 *
	 * @param cause
	 *
	 */
	public JConnectionException(Throwable cause) {
		super(cause);
	}	
}
