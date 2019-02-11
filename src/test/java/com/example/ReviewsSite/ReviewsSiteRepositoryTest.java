package com.example.ReviewsSite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;


public class ReviewsSiteRepositoryTest {
	
	
	ReviewsSiteRepository undertest;
	
	private Long id = 1L;
	private Review firstReview = new Review(id,"title","body","picture");
	
	private Long id2 = 2L;
	private Review secondReview = new Review(id2,"title","body","picture");

	@Test
	public void shouldFindAReview(){
	    undertest = new ReviewsSiteRepository(firstReview);
		Review result = undertest.findReview(id);
		assertThat(result,is(firstReview));
	}
	@Test
	public void shouldFindASecondReview() {
		undertest = new ReviewsSiteRepository(secondReview);
		Review result = undertest.findReview(id2);
		assertThat(result,is(secondReview));
	}
	@Test
	public void shouldFindAllReviewS() {
		undertest = new ReviewsSiteRepository(firstReview,secondReview);
		Collection<Review> result = undertest.findAllReviews();
		assertThat(result,containsInAnyOrder(firstReview,secondReview));
	}
	

}
