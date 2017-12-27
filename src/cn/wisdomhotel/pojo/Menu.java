package cn.wisdomhotel.pojo;

public class Menu {
	private Integer id;
	private Integer parentId;
	private String name;
	private String url;
	private Integer manageStatus;
	private Integer grade;
	private String description;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getManageStatus() {
		return manageStatus;
	}
	public void setManageStatus(Integer manageStatus) {
		this.manageStatus = manageStatus;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
