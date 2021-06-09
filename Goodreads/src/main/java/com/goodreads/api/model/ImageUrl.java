package com.goodreads.api.model;

public class ImageUrl {
	private boolean nophoto;
	private String content;

	public boolean isNophoto() {
		return nophoto;
	}

	public void setNophoto(boolean nophoto) {
		this.nophoto = nophoto;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
