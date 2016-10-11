package cn.dfrz.mymusic.entity;

public class UserCollection {
	private int collId;
	private String songname;
	private String singername;
	public int getCollId() {
		return collId;
	}
	public void setCollId(int collId) {
		this.collId = collId;
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
		return "UserCollection [collId=" + collId + ", songname=" + songname
				+ ", singername=" + singername + "]";
	}
	public UserCollection(int collId, String songname, String singername) {
		super();
		this.collId = collId;
		this.songname = songname;
		this.singername = singername;
	}
	public UserCollection() {
		super();
	}

	
	

}
