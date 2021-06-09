package com.goodreads.api.model;

public class Shelf {
	private Object review_shelf_id;
	private String name;
	private boolean exclusive;
	private int id;
	private boolean sortable;

	public Object getReview_shelf_id() {
		return review_shelf_id;
	}

	public void setReview_shelf_id(Object review_shelf_id) {
		this.review_shelf_id = review_shelf_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isExclusive() {
		return exclusive;
	}

	public void setExclusive(boolean exclusive) {
		this.exclusive = exclusive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSortable() {
		return sortable;
	}

	public void setSortable(boolean sortable) {
		this.sortable = sortable;
	}

}
