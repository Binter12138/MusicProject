package cn.dfrz.mymusic.entity;

public class UserCollection {
	private String username;
	private String songname;
	private String singername;
	private String songpath;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getSingername() {
		return singername;
	}
	public void setSingername(String singername) {
		this.singername = singername;
	}
	public String getSongpath() {
		return songpath;
	}
	public void setSongpath(String songpath) {
		this.songpath = songpath;
	}
	@Override
	public String toString() {
		return "UserCollection [username=" + username + ", songname="
				+ songname + ", singername=" + singername + ", songpath="
				+ songpath + "]";
	}
	public UserCollection(String username, String songname, String singername,
			String songpath) {
		super();
		this.username = username;
		this.songname = songname;
		this.singername = singername;
		this.songpath = songpath;
	}
	public UserCollection() {
		super();
	}
	
	
	

}
