package knowpets.bean;

import java.io.Serializable;

public class Blog implements Serializable{
	private int blogid;
	private int bloguid;
	private String blogpetname;
	private String blogtime;
	private String blogtitle;
	private String blogsubstance;
	private int bloglikes;
	private String bloguname;
	private String bloguportrait;
	
	public String getBloguportrait() {
		return bloguportrait;
	}
	public void setBloguportrait(String bloguportrait) {
		this.bloguportrait = bloguportrait;
	}
	public String getBloguname() {
		return bloguname;
	}
	public void setBloguname(String bloguname) {
		this.bloguname = bloguname;
	}
	public int getBlogid() {
		return blogid;
	}
	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}
	public int getBloguid() {
		return bloguid;
	}
	public void setBloguid(int bloguid) {
		this.bloguid = bloguid;
	}

	public String getBlogpetname() {
		return blogpetname;
	}
	public void setBlogpetname(String blogpetname) {
		this.blogpetname = blogpetname;
	}
	public String getBlogtime() {
		return blogtime;
	}
	public void setBlogtime(String blogtime) {
		this.blogtime = blogtime;
	}
	public String getBlogtitle() {
		return blogtitle;
	}
	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}
	public String getBlogsubstance() {
		return blogsubstance;
	}
	public void setBlogsubstance(String blogsubstance) {
		this.blogsubstance = blogsubstance;
	}
	public int getBloglikes() {
		return bloglikes;
	}
	public void setBloglikes(int bloglikes) {
		this.bloglikes = bloglikes;
	}
}
