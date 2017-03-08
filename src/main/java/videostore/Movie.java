package videostore;
import java.math.BigDecimal;

public abstract class Movie {

	String title;
	String priceCode;

	public Movie(String title, String priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public String getPriceCode() {
		return priceCode;
	}

	public abstract BigDecimal calculateFees(int days);
}
