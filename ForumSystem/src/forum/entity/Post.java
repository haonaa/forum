package forum.entity;
// Generated 2018-1-28 15:26:03 by Hibernate Tools 5.2.8.Final

import java.util.Date;

/**
 * Post generated by hbm2java
 */
public class Post implements java.io.Serializable {

	private int pid;
	private int puid;
	private String pcontent;
	private Date ppubDate;

	public Post() {
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPuid() {
		return puid;
	}

	public void setPuid(int puid) {
		this.puid = puid;
	}

	public String getPcontent() {
		return pcontent;
	}

	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}

	public Date getPpubDate() {
		return ppubDate;
	}

	public void setPpubDate(Date ppubDate) {
		this.ppubDate = ppubDate;
	}


}
