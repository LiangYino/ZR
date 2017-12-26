package cn.wisdomhotel.pojo;

public class Calendar {
	/**
	 * private attr
	 */
	private Integer id;
	private String scheduleName;
	private String scheduleDay;
	private Integer type;
	private String targetAgent;
	
	/**
	 * get and set method
	 */
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getScheduleName() {
		return scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	public String getScheduleDay() {
		return scheduleDay;
	}
	public void setScheduleDay(String scheduleDay) {
		this.scheduleDay = scheduleDay;
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
