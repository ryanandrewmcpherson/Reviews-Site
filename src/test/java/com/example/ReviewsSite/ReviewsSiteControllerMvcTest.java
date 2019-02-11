package com.example.ReviewsSite;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewsSiteController.class)
public class ReviewsSiteControllerMvcTest {
	
	@Resource
	private MockMvc mvc;
	
	@Mock
	private Review firstReview;
	
	@Mock
	private Review secondReview;
	
	
	
	@MockBean
	private ReviewsSiteRepository reviewsSiteRepository;
	
	@Test
	public void shouldBeOkForAllReviews() throws Exception{
		mvc.perform(get("/show-reviews")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldRouteToAllReviewsView() throws Exception{
		mvc.perform(get("/show-reviews")).andExpect(view().name(is("reviews")));
	}
	
	@Test
	public void shouldPutAllCoursesIntoModel() throws Exception{
		Collection<Review>allReviews = asList(firstReview,secondReview);
		when(reviewsSiteRepository.findAllReviews()).thenReturn(allReviews);
		mvc.perform(get("/show-reviews")).andExpect(model().attribute("reviews",allReviews));	
	}
	
	@Test
	public void shouldBeOkForOneReview() throws Exception{
		mvc.perform(get("/review?id=1")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldRouteToOneReviewView() throws Exception{
		mvc.perform(get("/review?id=1")).andExpect(view().name(is("review")));
	}
	@Test
	public void shouldPutASingleCourseIntoModel() throws Exception{
		when(reviewsSiteRepository.findReview(1L)).thenReturn(firstReview);
		mvc.perform(get("/review?id=1")).andExpect(model().attribute("reviews",firstReview));	
	}
	

}
