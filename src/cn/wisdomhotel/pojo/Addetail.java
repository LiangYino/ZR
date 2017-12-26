package cn.wisdomhotel.pojo;

public class Addetail {
	
	/**
	 * private attr
	 */
	
	private Integer id;
	private String name;
	private Integer type;
	private String filePath;
	private Integer position;
	private Integer ad;
	
	/**
	 * get and set method
	 */
	
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
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Integer getAd() {
		return ad;
	}
	public void setAd(Integer ad) {
		this.ad = ad;
	}
}
