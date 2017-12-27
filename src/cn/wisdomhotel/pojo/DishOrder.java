package cn.wisdomhotel.pojo;

import java.sql.Date;

public class DishOrder {
	private Integer id;
	private Integer dishId;
	private Integer userId;
	private Integer orderNum;
	private Double totalPrice;
	private Date orderTime;
	private Integer sendIf;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDishId() {
		return dishId;
	}
	public void setDishId(Integer dishId) {
		this.dishId = dishId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Integer getSendIf() {
		return sendIf;
	}
	public void setSendIf(Integer sendIf) {
		this.sendIf = sendIf;
	}
}
