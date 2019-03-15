package com.pojo;

public class CommentPojo {

	String comment;

	public  CommentPojo(String comment) {
		//super();
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "CommentPOJO [comment=" + comment + "]";
	}

}
