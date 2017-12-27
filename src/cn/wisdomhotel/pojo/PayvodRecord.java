package cn.wisdomhotel.pojo;

import java.sql.Date;

public class PayvodRecord {
	private Integer id;
	private Integer userId;
	private Date payTime;
	private Integer payType;
	private String payMoney;
	private Integer vodId;
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
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public String getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
	}
	public Integer getVodId() {
		return vodId;
	}
	public void setVodId(Integer vodId) {
		this.vodId = vodId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
