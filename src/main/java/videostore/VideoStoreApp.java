package videostore;
import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class VideoStoreApp {

	public static void main(String[] args) {
		
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(VideoStoreApp.class)) {

			VideoStoreApp application = context.getBean(VideoStoreApp.class);
			application.calculateFees();

		}
	}
	
	@Resource
	private MovieFactory factory;
	
	public void calculateFees() {
		calculateRegularFees();

		calculateChildrensFees();

		calculateNewReleaseFees();
	}

	private void calculateRegularFees() {
		String title = "WCCI";
		Movie regular = factory.createRegular(title);
		printAmountDue(regular, 2);
		printAmountDue(regular, 3);
		printAmountDue(regular, 5);
	}

	private void calculateChildrensFees() {
		String title = "Up";
		Movie childrens = factory.createChildrens(title);
		printAmountDue(childrens, 3);
		printAmountDue(childrens, 4);
		printAmountDue(childrens, 5);
	}

	private void calculateNewReleaseFees() {
		String title = "Dr Strange";
		Movie newRelease = factory.createNewRelease(title);
		printAmountDue(newRelease, 1);
		printAmountDue(newRelease, 5);
	}

	private void printAmountDue(Movie movie, int days) {
		BigDecimal fees = movie.calculateFees(days);
		String message = String.format("amount due for a %s movie for %s days = %s", movie.getPriceCode(), days, fees);
		System.out.println(message);
	}

}
