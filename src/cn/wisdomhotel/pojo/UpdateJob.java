package cn.wisdomhotel.pojo;

import java.sql.Date;

public class UpdateJob {
	private Integer id;
	private String name;
	private String filePath;
	private Date beginTime;
	private Date endTime;
	private Double version;
	private Integer type;
	private String targetAgent;
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
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Double getVersion() {
		return version;
	}
	public void setVersion(Double version) {
		this.version = version;
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
