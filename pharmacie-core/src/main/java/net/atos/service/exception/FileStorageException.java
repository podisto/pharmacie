/**
 * 
 */
package net.atos.service.exception;

/**
 * @author A707592
 *
 */
public class FileStorageException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileStorageException(String message) {
		super(message);
	}
	
	public FileStorageException(String message, Throwable e) {
		super(message, e);
	}
}
