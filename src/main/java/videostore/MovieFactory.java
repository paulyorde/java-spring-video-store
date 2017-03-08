package videostore;

import org.springframework.stereotype.Component;

@Component
public class MovieFactory {

	Movie createRegular(String title) {
		Movie regular = new RegularMovie(title);
		return regular;
	}

	Movie createChildrens(String title) {
		Movie childrens = new ChildrensMovie(title);
		return childrens;
	}

	Movie createNewRelease(String title) {
		Movie newRelease = new NewRelease(title);
		return newRelease;
	}

}
