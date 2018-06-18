package org.wecancodeit.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;

	@RequestMapping("/show-reviews")
	public String findAllReviews(Model model) {
	model.addAttribute("reviews", reviewRepo.findAllReviews());
	return"reviews";
}
	
	@RequestMapping("/review")
	public String findOneReview(@RequestParam(value = "id") Long id) {
		return "review";
	}

	
	
	
}