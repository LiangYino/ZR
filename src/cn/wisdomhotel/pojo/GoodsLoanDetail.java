package cn.wisdomhotel.pojo;

import java.sql.Date;

public class GoodsLoanDetail {
	private Integer id;
	private Integer loadId;
	private Integer userId;
	private Date loanTime;
	private Integer loanNum;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLoadId() {
		return loadId;
	}
	public void setLoadId(Integer loadId) {
		this.loadId = loadId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getLoanTime() {
		return loanTime;
	}
	public void setLoanTime(Date loanTime) {
		this.loanTime = loanTime;
	}
	public Integer getLoanNum() {
		return loanNum;
	}
	public void setLoanNum(Integer loanNum) {
		this.loanNum = loanNum;
	}
}
