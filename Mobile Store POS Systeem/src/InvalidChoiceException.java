
public class InvalidChoiceException extends Exception {
	public InvalidChoiceException(int choice) {
		super("\n"+choice+" Is Invalid Choice. Choice Must Be 1 to 11. ");
	}
}
