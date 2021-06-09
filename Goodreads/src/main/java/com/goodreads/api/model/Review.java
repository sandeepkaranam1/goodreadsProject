package com.goodreads.api.model;

public class Review {
	private String recommended_for;
	private String date_updated;
	private boolean spoiler_flag;
	private Book book;
	private int rating;
	private String link;
	private String body;
	private Shelves shelves;
	private String url;
	private String date_added;
	private int comments_count;
	private int owned;
	private String started_at;
	private String read_at;
	private int votes;
	private String recommended_by;
	private Object id;
	private String spoilers_state;
	private int read_count;

	public String getRecommended_for() {
		return recommended_for;
	}

	public void setRecommended_for(String recommended_for) {
		this.recommended_for = recommended_for;
	}

	public String getDate_updated() {
		return date_updated;
	}

	public void setDate_updated(String date_updated) {
		this.date_updated = date_updated;
	}

	public boolean isSpoiler_flag() {
		return spoiler_flag;
	}

	public void setSpoiler_flag(boolean spoiler_flag) {
		this.spoiler_flag = spoiler_flag;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Shelves getShelves() {
		return shelves;
	}

	public void setShelves(Shelves shelves) {
		this.shelves = shelves;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	public int getComments_count() {
		return comments_count;
	}

	public void setComments_count(int comments_count) {
		this.comments_count = comments_count;
	}

	public int getOwned() {
		return owned;
	}

	public void setOwned(int owned) {
		this.owned = owned;
	}

	public String getStarted_at() {
		return started_at;
	}

	public void setStarted_at(String started_at) {
		this.started_at = started_at;
	}

	public String getRead_at() {
		return read_at;
	}

	public void setRead_at(String read_at) {
		this.read_at = read_at;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public String getRecommended_by() {
		return recommended_by;
	}

	public void setRecommended_by(String recommended_by) {
		this.recommended_by = recommended_by;
	}

	public Object getId() {
		return id;
	}

	public void setId(Object id) {
		this.id = id;
	}

	public String getSpoilers_state() {
		return spoilers_state;
	}

	public void setSpoilers_state(String spoilers_state) {
		this.spoilers_state = spoilers_state;
	}

	public int getRead_count() {
		return read_count;
	}

	public void setRead_count(int read_count) {
		this.read_count = read_count;
	}

}
