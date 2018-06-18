package org.wecancodeit.reviewssite;

public class Review {

	private long id;
	private String calendarName;
	private String imageUrl;
	private String calendarCategory;
	private String calendarDescription;

	public Review(long id, String calendarName, String imageUrl, String calendarCategory, String calendarDescription) {
		this.id = id;
		this.calendarName=calendarName;
		this.imageUrl=imageUrl;
		this.calendarCategory=calendarCategory;
		this.calendarDescription=calendarDescription;

	}

	public Long getId() {
		return id;
	}
	
	
	public String getCalendarName() {
		return calendarName;
	}

	
	public String getImageUrl() {
		return imageUrl;
	}

	public String getCalendarCateg() {
		return calendarCategory;
	}
	
	public String getCalendarDesc() {
		return calendarDescription;
	}


}
