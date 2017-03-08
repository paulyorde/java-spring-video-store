package videostore;
import java.math.BigDecimal;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title, "regular");
	}

	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal amount = new BigDecimal("2.00");
		if (days > 2) {
			BigDecimal extraDays = new BigDecimal(days - 2);
			amount = amount.add(new BigDecimal("1.5").multiply(extraDays));
		}
		return amount;
	}

}
