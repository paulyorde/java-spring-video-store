package videostore;

import java.math.BigDecimal;

public class Rental {

	private Movie movie;
	private int days;

	public Rental(Movie movie, int days) {
		this.movie = movie;
		this.days = days;
	}
	
	public String getTitle() {
		return movie.getTitle();
	}
	
	public BigDecimal getFees() {
		return movie.calculateFees(days);
	}
}