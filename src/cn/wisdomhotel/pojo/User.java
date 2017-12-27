package cn.wisdomhotel.pojo;

import java.sql.Date;

public class User {
	private Integer id;
	private Integer groupId;
	private String name;
	private String mac;
	private Integer status;
	private String version;
	private Integer sex;
	private Integer roomStatus;
	private Integer online;
	private Date connectTime;
	private Date disconectTime;
	private Date roomStart;
	private Date roomEnd;
	private String userName;
	private Integer voice;
	private Date openTime;
	private Date closeTime;
	private Integer type;
	private Integer proid;
	private String ip;
	private Integer housetype;
	private String idcard;
	private Integer prodid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(Integer roomStatus) {
		this.roomStatus = roomStatus;
	}
	public Integer getOnline() {
		return online;
	}
	public void setOnline(Integer online) {
		this.online = online;
	}
	public Date getConnectTime() {
		return connectTime;
	}
	public void setConnectTime(Date connectTime) {
		this.connectTime = connectTime;
	}
	public Date getDisconectTime() {
		return disconectTime;
	}
	public void setDisconectTime(Date disconectTime) {
		this.disconectTime = disconectTime;
	}
	public Date getRoomStart() {
		return roomStart;
	}
	public void setRoomStart(Date roomStart) {
		this.roomStart = roomStart;
	}
	public Date getRoomEnd() {
		return roomEnd;
	}
	public void setRoomEnd(Date roomEnd) {
		this.roomEnd = roomEnd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getVoice() {
		return voice;
	}
	public void setVoice(Integer voice) {
		this.voice = voice;
	}
	public Date getOpenTime() {
		return openTime;
	}
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
	public Date getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getProid() {
		return proid;
	}
	public void setProid(Integer proid) {
		this.proid = proid;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getHousetype() {
		return housetype;
	}
	public void setHousetype(Integer housetype) {
		this.housetype = housetype;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public Integer getProdid() {
		return prodid;
	}
	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}
}
