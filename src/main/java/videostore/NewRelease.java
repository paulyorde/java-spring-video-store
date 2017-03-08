package videostore;
import java.math.BigDecimal;

public class NewRelease extends Movie {

	public NewRelease(String title) {
		super(title, "new release");
	}

	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal rentalDays = new BigDecimal(days);
		return new BigDecimal("3.00").multiply(rentalDays);
	}

}
