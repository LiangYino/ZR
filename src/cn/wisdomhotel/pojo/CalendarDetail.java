package cn.wisdomhotel.pojo;

import java.sql.Time;

public class CalendarDetail {
	
	/**
	 * private attr
	 */
	
	private Integer id;
	private String name;
	private Integer calendarId;
	private Integer programListId;
	private Time timeBegin;
	private Time timeEnd;
	
	/**
	 * get and set method
	 */
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCalendarId() {
		return calendarId;
	}
	public void setCalendarId(Integer calendarId) {
		this.calendarId = calendarId;
	}
	public Integer getProgramListId() {
		return programListId;
	}
	public void setProgramListId(Integer programListId) {
		this.programListId = programListId;
	}
	public Time getTimeBegin() {
		return timeBegin;
	}
	public void setTimeBegin(Time timeBegin) {
		this.timeBegin = timeBegin;
	}
	public Time getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(Time timeEnd) {
		this.timeEnd = timeEnd;
	}
}
