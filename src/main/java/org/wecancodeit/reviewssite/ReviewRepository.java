package org.wecancodeit.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {
		Review mainecoonmadness = new Review(1L, "Maine Coon Madness","/images/mainecoon.jpg", "cats", "The Maine Coon Madness calendar features 12 months of your favorite large boned cat breed in various poses with their beloved human companions."); 
		Review dogsincostumes = new Review(2L, "Dogs in Costumes", "/images/dogscostume.jpg", "dogs", "The Dogs In Costume calendars highlights this years winners of the National Costumed Dogs annual awards.");
	    Review ferretsasmythicalcreatures = new Review(3L, "Ferrets as Mythical Creatures", "/images/ferrets.jpg", "ferrets", "The Ferrets as Mythical Creatures calendars feature ferrtes dressed up as vampires, frankensteins, werewolfs, griffins and many more!");
	    Review alpacaportraits = new Review(4L, "Alpaca Portraits", "images/alpacas.jpg", "alpacas", "The Alpaca Portraits calendars offers both whimsical and earnest, candid portraits of alpacas in their natural habitat. ");

	    
	    reviewList.put(mainecoonmadness.getId(), mainecoonmadness);
	    reviewList.put(dogsincostumes.getId(), dogsincostumes);
	    reviewList.put(ferretsasmythicalcreatures.getId(), ferretsasmythicalcreatures);
	    reviewList.put(alpacaportraits.getId(), alpacaportraits);
	}

	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findAReview(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAllReviews() {
		return reviewList.values();
	}


	public Object findOne(Long id) {
		return reviewList.get(id);
	}
}
