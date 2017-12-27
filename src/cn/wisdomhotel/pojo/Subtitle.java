package cn.wisdomhotel.pojo;

import java.sql.Date;

public class Subtitle {
	private Integer id;
	private String title;
	private String content;
	private Integer status;
	private Date starttime;
	private Date endtime;
	private Integer type;
	private String targetAgent;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
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
}
