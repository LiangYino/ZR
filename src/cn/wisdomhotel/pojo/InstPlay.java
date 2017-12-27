package cn.wisdomhotel.pojo;

import java.sql.Date;

public class InstPlay {
	private Integer id;
	private Date creatTime;
	private Integer status;
	private String name;
	private String sname;
	private Integer sid;
	private Integer stype;
	private String surl;
	private String targetAgent;
	private Integer type;
	private Integer lastStatus;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getStype() {
		return stype;
	}
	public void setStype(Integer stype) {
		this.stype = stype;
	}
	public String getSurl() {
		return surl;
	}
	public void setSurl(String surl) {
		this.surl = surl;
	}
	public String getTargetAgent() {
		return targetAgent;
	}
	public void setTargetAgent(String targetAgent) {
		this.targetAgent = targetAgent;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getLastStatus() {
		return lastStatus;
	}
	public void setLastStatus(Integer lastStatus) {
		this.lastStatus = lastStatus;
	}
}
