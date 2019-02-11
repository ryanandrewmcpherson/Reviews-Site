package com.example.ReviewsSite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsSiteController {
	
	@Resource
	ReviewsSiteRepository reviewsSiteRepo;
	
	@RequestMapping("/show-reviews")
	public String findAllReviews(Model model) {
		model.addAttribute("reviews",reviewsSiteRepo.findAllReviews());
		return "reviews";
		
	}
	
	@RequestMapping("/review")
	public String findOneReview(@RequestParam(value = "id")Long id, Model model) {
		model.addAttribute("reviews",reviewsSiteRepo.findReview(id));
		return "review";
	}

}
