package org.wecancodeit.reviewssite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

	@RequestMapping("/show-reviews")
	public String findAllReviews() {

	return"reviews";

}
}
