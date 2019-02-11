package com.example.ReviewsSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewsSiteRepository {

	private Map<Long, Review> reviewsList = new HashMap<Long, Review>();

	public ReviewsSiteRepository() {
		reviewsList.put(1L, new Review(1L, "Logitech M705 Marathon Mouse","At an average price of only $20.99 plus tax the Logitech M705 Marathon Mouse (wireless) is a tremendous value! It offers an ergonomic thumb rest and a sculpted design allowing for comfortable placement of the right hand that doesn't produce discomfort or strain with time. It claims a 3 year batter life, which is insanely long and hard to test. It uses laser tracking which is better than the standard optical tracking mechanism and uncommon for this price segment for a wireless mouse. It comes with a universal reciever that can talk to other Logitech accessories as well as the mouse. It offers 7 customizable funcions ($3 each hehe), which is more than the acceptable number for this price range of mouse. It has equally sized right and left click buttons that are comfortable and easy to reach. It has a clickable scrollwheel that can also go to the left or to the right as separate functions. It has a toggle button for smooth or graduated scrolling. There are only a few downsides. It has two narrow buttons above the thumbrest that admittedly are not the most comfortable to press. Those default to forward and backward. It also feels a bit heavy, especially with the default scanning sensitivity. This is easily rememdied by downloading the Logitech Options application and customizing that feature. Once that software is set up there are a wide variety of function customization options available that can also be apllication specific. Overall it's a 9/10","/images/mouse.png"));
		reviewsList.put(2L, new Review(2L, "Logitech M705 Marathon Mouse","Mouse Review","/images/mouse.png"));
		reviewsList.put(3L, new Review(3L, "Logitech M705 Marathon Mouse","Mouse Review","/images/mouse.png"));
	}

	// constructor for testing only
	public ReviewsSiteRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewsList.put(review.getId(), review);
		}
	}

	public Review findReview(Long id) {
		return reviewsList.get(id);
	}

	public Collection<Review> findAllReviews() {

		return reviewsList.values();
	}

}
