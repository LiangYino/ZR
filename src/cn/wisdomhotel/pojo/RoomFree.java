package cn.wisdomhotel.pojo;

import java.sql.Date;

public class RoomFree {
	private Integer id;
	private Integer userId;
	private Double price;
	private Date orderTime;
	private Integer satatus;
	private String content;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Integer getSatatus() {
		return satatus;
	}
	public void setSatatus(Integer satatus) {
		this.satatus = satatus;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
