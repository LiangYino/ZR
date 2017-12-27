package cn.wisdomhotel.pojo;

import java.sql.Date;

public class Notice {
	private Integer id;
	private String orderTime;
	private Integer userId;
	private	String backAdmin;
	private Date backtime;
	private Date createtime;
	private Integer manageIf;
	private Integer backIf;
	private String updateadmin;
	private Date updateTime;
	private Integer notifyType;
	private String notifyNews;
	private Integer readStatus;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getBackAdmin() {
		return backAdmin;
	}
	public void setBackAdmin(String backAdmin) {
		this.backAdmin = backAdmin;
	}
	public Date getBacktime() {
		return backtime;
	}
	public void setBacktime(Date backtime) {
		this.backtime = backtime;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Integer getManageIf() {
		return manageIf;
	}
	public void setManageIf(Integer manageIf) {
		this.manageIf = manageIf;
	}
	public Integer getBackIf() {
		return backIf;
	}
	public void setBackIf(Integer backIf) {
		this.backIf = backIf;
	}
	public String getUpdateadmin() {
		return updateadmin;
	}
	public void setUpdateadmin(String updateadmin) {
		this.updateadmin = updateadmin;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getNotifyType() {
		return notifyType;
	}
	public void setNotifyType(Integer notifyType) {
		this.notifyType = notifyType;
	}
	public String getNotifyNews() {
		return notifyNews;
	}
	public void setNotifyNews(String notifyNews) {
		this.notifyNews = notifyNews;
	}
	public Integer getReadStatus() {
		return readStatus;
	}
	public void setReadStatus(Integer readStatus) {
		this.readStatus = readStatus;
	}
}
