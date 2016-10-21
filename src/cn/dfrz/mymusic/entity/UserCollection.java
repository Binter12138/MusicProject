package cn.dfrz.mymusic.entity;

public class UserCollection {
	private String username;
	private String songname;
	private String singername;
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
	@Override
	public String toString() {
		return "UserCollection [username=" + username + ", songname="
				+ songname + ", singername=" + singername + "]";
	}
	public UserCollection(String username, String songname, String singername) {
		super();
		this.username = username;
		this.songname = songname;
		this.singername = singername;
	}
	public UserCollection() {
		super();
	}
	
	
	

}
