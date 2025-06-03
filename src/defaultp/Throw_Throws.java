package defaultp;

class InsufficientException extends RuntimeException {
	public InsufficientException(String msg) {
		super(msg);
	}
}

public class Throw_Throws {
	public static void main(String[] args) {
		int balance = 100;
		int withdraw = 200;

		try {
			if (balance < withdraw) {
				throw new InsufficientException("Insufficient balance");
			}
			System.out.println("Transaction successful");
		} catch (InsufficientException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
