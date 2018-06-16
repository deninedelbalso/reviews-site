package org.wecancodeit.reviewssite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewsSiteTest {
	ReviewRepository underTest;

	private long firstReviewID = 1L;
	private Review firstReview = new Review(firstReviewID, "review title", "review image", "review category",
			"review content");

	private long secondReviewID = 2L;
	private Review secondReview = new Review(secondReviewID, "review title", "review image", "review category",
			"review content");

	@Test
	public void shouldFindAReview() {
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findAReview(firstReviewID);
		assertThat(result, is(firstReview));
	}

	public void shouldFindASecondReview() {
		underTest = new ReviewRepository(secondReview);
		Review result = underTest.findAReview(secondReviewID);
		assertThat(result, is(secondReview));

	}

	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAllReviews();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));

	}

}