import java.math.BigDecimal;

public class VideoStoreApp {

	public static void main(String[] args) {
		
		calculateRegularFees();
		
		calculateChildrensFees();

		calculateNewReleaseFees();		
	}

	private static void calculateRegularFees() {
		Movie regular = new RegularMovie("WCCI");
		printAmountDue(regular, 2);
		printAmountDue(regular, 3);
		printAmountDue(regular, 5);
	}

	private static void calculateChildrensFees() {
		Movie childrens = new ChildrensMovie("Up");
		printAmountDue(childrens, 3);
		printAmountDue(childrens, 4);
		printAmountDue(childrens, 5);
	}

	private static void calculateNewReleaseFees() {
		Movie newRelease = new NewRelease("Dr Strange");
		printAmountDue(newRelease, 1);
		printAmountDue(newRelease, 5);
	}

	private static void printAmountDue(Movie movie, int days) {
		BigDecimal fees = movie.calculateFees(days);
		String message = String.format("amount due for a %s movie for %s days = %s", movie.getPriceCode(), days, fees);
		System.out.println(message);
	}

}
