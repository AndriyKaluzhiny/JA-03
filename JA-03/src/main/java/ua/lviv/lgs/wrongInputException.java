package ua.lviv.lgs;

public class wrongInputException extends Exception {
	
	private static final long serialVersionUID = -6281355724458820710L;

	public wrongInputException() {
		System.err.println("WrongInputException, you must to follow the instructions");
	}
}
