package cn.wisdomhotel.pojo;

import java.sql.Time;

public class MsgInsert {
	private Integer id;
	private String name;
	private Time begintime;
	private Time endTime;
	private Integer type;
	private String targetAgent;
	private Integer status;
	private Integer cpType;
	private String cpTime;
	private Integer used;
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
	public Time getBegintime() {
		return begintime;
	}
	public void setBegintime(Time begintime) {
		this.begintime = begintime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getTargetAgent() {
		return targetAgent;
	}
	public void setTargetAgent(String targetAgent) {
		this.targetAgent = targetAgent;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCpType() {
		return cpType;
	}
	public void setCpType(Integer cpType) {
		this.cpType = cpType;
	}
	public String getCpTime() {
		return cpTime;
	}
	public void setCpTime(String cpTime) {
		this.cpTime = cpTime;
	}
	public Integer getUsed() {
		return used;
	}
	public void setUsed(Integer used) {
		this.used = used;
	}
}
