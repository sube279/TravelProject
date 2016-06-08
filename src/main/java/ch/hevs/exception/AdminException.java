package ch.hevs.exception;

public class AdminException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  AdminException() {
		super();
	}

	public AdminException(String arg0) {
		super(arg0);
	}

	public AdminException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public AdminException(Throwable arg0) {
		super(arg0);
	}
}
