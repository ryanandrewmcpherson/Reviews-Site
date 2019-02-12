package com.example.ReviewsSite;

public class Review {

	private long id;
	private String title ;
	private String body;
	private String picture;
	private String category;
	

	public Review(long id, String category, String title, String body, String picture) {
		this.setId(id);
		this.setCategory(category);
		this.setTitle(title);
		this.setBody(body);
		this.setPicture(picture);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
