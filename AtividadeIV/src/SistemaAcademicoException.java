class SistemaAcademicoException extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SistemaAcademicoException(String message) {
        super(message);
    }  
    public SistemaAcademicoException(String message, Throwable cause) {
        super(message, cause);
    }
    public SistemaAcademicoException(Throwable cause) {
        super(cause);
    }
}
