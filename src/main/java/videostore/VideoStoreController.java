package videostore;
import java.util.Arrays;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoStoreController {

	@Resource
	private MovieFactory factory;
	
	@RequestMapping("/showRentals")
	public String showRentals(Model model) {
		
		Movie regular = factory.createRegular("WCCI");
		Movie childrens = factory.createChildrens("Up");
		Movie newRelease = factory.createNewRelease("Dr Strange");
		
		Collection<Rental> rentals = Arrays.asList(new Rental(regular,2), new Rental(childrens, 3), new Rental(newRelease, 4));
		
		model.addAttribute("rentals", rentals);
		
		return "rentals";
	}

}
