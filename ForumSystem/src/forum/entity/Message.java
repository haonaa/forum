package forum.entity;
// Generated 2018-1-28 15:26:03 by Hibernate Tools 5.2.8.Final

import java.util.Date;

/**
 * Message generated by hbm2java
 */
public class Message implements java.io.Serializable {

	private Integer mid;
	private Integer muid;
	private Integer mrepid;
	private Integer mpid;
	private String mcontent;
	private Date mpubdate;

	public Message() {
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Integer getMuid() {
		return muid;
	}

	public void setMuid(Integer muid) {
		this.muid = muid;
	}

	public Integer getMrepid() {
		return mrepid;
	}

	public void setMrepid(Integer mrepid) {
		this.mrepid = mrepid;
	}

	public Integer getMpid() {
		return mpid;
	}

	public void setMpid(Integer mpid) {
		this.mpid = mpid;
	}

	public String getMcontent() {
		return mcontent;
	}

	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}

	public Date getMpubdate() {
		return mpubdate;
	}

	public void setMpubdate(Date mpubdate) {
		this.mpubdate = mpubdate;
	}


}
